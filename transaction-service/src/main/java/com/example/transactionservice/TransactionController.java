package com.example.transactionservice;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
