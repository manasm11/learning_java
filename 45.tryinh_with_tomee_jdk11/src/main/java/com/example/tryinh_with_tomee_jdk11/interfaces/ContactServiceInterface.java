package com.example.tryinh_with_tomee_jdk11.interfaces;

import com.example.tryinh_with_tomee_jdk11.models.Contact;

import java.util.List;

public interface ContactServiceInterface {
    List<Contact> getAllContacts();
    Contact getContact(String name);
    Contact addContact(Contact contact);
    Contact updateContact(Contact contact);
    Contact removeContact(String name);
}
