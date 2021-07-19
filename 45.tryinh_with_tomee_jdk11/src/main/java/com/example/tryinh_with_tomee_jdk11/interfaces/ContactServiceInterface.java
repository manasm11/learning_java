package com.example.tryinh_with_tomee_jdk11.interfaces;

import com.example.tryinh_with_tomee_jdk11.exceptions.ContactAlreadyExistsException;
import com.example.tryinh_with_tomee_jdk11.exceptions.ContactDoesntExistsException;
import com.example.tryinh_with_tomee_jdk11.models.Contact;

import java.util.List;

public interface ContactServiceInterface {
    List<Contact> getAllContacts();
    Contact getContact(String name) throws ContactDoesntExistsException;
    Contact addContact(Contact contact) throws ContactAlreadyExistsException;
    Contact updateContact(Contact contact) throws ContactDoesntExistsException;
    Contact removeContact(String name) throws ContactDoesntExistsException;
}
