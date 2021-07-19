package com.example.tryinh_with_tomee_jdk11.services;

import com.example.tryinh_with_tomee_jdk11.exceptions.ContactAlreadyExistsException;
import com.example.tryinh_with_tomee_jdk11.exceptions.ContactDoesntExistsException;
import com.example.tryinh_with_tomee_jdk11.interfaces.ContactServiceInterface;
import com.example.tryinh_with_tomee_jdk11.models.Contact;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ContactService implements ContactServiceInterface {

    static final String JSON_FILE = "/home/m/Codes/learning_java/45.tryinh_with_tomee_jdk11/src/main/resources/contacts.json";

    @Override
    public List<Contact> getAllContacts() {
        return readContactsFromJsonFile();
    }

    @Override
    public Contact getContact(String name) throws ContactDoesntExistsException {
        List<Contact> contacts = readContactsFromJsonFile();
        return getOldContact(name, contacts);
    }

    @Override
    public Contact addContact(Contact contact) throws ContactAlreadyExistsException {
        List<Contact> contacts = readContactsFromJsonFile();
        verifyContactDoesntExists(contact, contacts);
        contacts.add(contact);
        saveContactsToJsonFile(contacts);
        return contact;
    }

    @Override
    public Contact updateContact(Contact contact) throws ContactDoesntExistsException {
        List<Contact> contacts = readContactsFromJsonFile();
        Contact oldContact = getOldContact(contact, contacts);
        int contactIndex = contacts.indexOf(oldContact);
        contacts.get(contactIndex).setEmail(contact.getEmail());
        contacts.get(contactIndex).setPhone(contact.getPhone());
        saveContactsToJsonFile(contacts);
        return contacts.get(contactIndex);
    }

    @Override
    public Contact removeContact(String name) throws ContactDoesntExistsException {
        List<Contact> contacts = readContactsFromJsonFile();
        Contact oldContact = getOldContact(name, contacts);
        contacts.remove(oldContact);
        saveContactsToJsonFile(contacts);
        return oldContact;
    }

    private Contact getOldContact(Contact contact, List<Contact> contacts) throws ContactDoesntExistsException {
        Optional<Contact> oldContact = contacts.stream()
                .filter(contact1 -> contact.getName().equals(contact1.getName()))
                .findFirst();
        if (!oldContact.isPresent())
            throw new ContactDoesntExistsException(
                    "Contact with name: " + contact.getName() + " doesn't exists."
            );
        return oldContact.get();
    }

    private Contact getOldContact(String name, List<Contact> contacts) throws ContactDoesntExistsException {
        Contact tempContact = new Contact();
        tempContact.setName(name);
        return getOldContact(tempContact, contacts);
    }

    private List<Contact> readContactsFromJsonFile() {
        ObjectMapper mapper = new ObjectMapper();
        try (FileReader reader = new FileReader(JSON_FILE)) {
            Contact[] contacts = mapper.readValue(reader, Contact[].class);
            return new ArrayList<>(Arrays.asList(contacts));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void saveContactsToJsonFile(List<Contact> contacts) {
        ObjectMapper mapper = new ObjectMapper();
        try (FileWriter writer = new FileWriter(JSON_FILE, false)) {
            mapper.writeValue(writer, contacts.toArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void verifyContactDoesntExists(Contact contact, List<Contact> contacts) throws
            ContactAlreadyExistsException {
        Optional<Contact> optionalContact = contacts.stream()
                .filter(contact1 -> contact.getName().equals(contact1.getName()))
                .findFirst();
        if (optionalContact.isPresent()) {
            throw new ContactAlreadyExistsException(
                    "Contact for " + contact.getName() + "already exists. (" + optionalContact.get() + ")"
            );
        }
    }
}
