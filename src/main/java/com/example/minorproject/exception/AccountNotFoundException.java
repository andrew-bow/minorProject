package com.example.minorproject.exception;

public class AccountNotFoundException extends  RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
