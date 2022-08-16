package com.example.minorproject.controller;

import com.example.minorproject.dto.AccountRequestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/hello")
    public String helloSpirng() {
        return "Hello spring!";
    }
    @PostMapping("/accounts")
    public Long createAccount (@RequestBody AccountRequestDTO accountRequestDTO ){

    }
}
