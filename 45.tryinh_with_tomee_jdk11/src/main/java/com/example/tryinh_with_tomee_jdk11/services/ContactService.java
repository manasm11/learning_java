package com.example.tryinh_with_tomee_jdk11.services;

import com.example.tryinh_with_tomee_jdk11.interfaces.ContactServiceInterface;
import com.example.tryinh_with_tomee_jdk11.models.Contact;

import java.util.List;

public class ContactService implements ContactServiceInterface {

    @Override
    public List<Contact> getAllContacts() {
        
        return null;
    }

    @Override
    public Contact getContact(String name) {
        return null;
    }

    @Override
    public Contact addContact(Contact contact) {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }

    @Override
    public Contact removeContact(String name) {
        return null;
    }
}
