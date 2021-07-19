package com.example.tryinh_with_tomee_jdk11.exceptions;

public class ContactAlreadyExistsException extends Exception {
    public ContactAlreadyExistsException(String message) {
        super(message);
    }
}
