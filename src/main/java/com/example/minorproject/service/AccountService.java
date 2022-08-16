package com.example.minorproject.service;

import com.example.minorproject.repository.AccountRepository;

public class AccountService {
    private final AccountRepository accountRepository ;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
