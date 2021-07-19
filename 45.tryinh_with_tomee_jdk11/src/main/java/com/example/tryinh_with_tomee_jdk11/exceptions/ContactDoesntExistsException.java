package com.example.tryinh_with_tomee_jdk11.exceptions;

public class ContactDoesntExistsException extends Exception {
    public ContactDoesntExistsException(String message) {
        super(message);
    }
}
