package com.example.accountsservice.controller;

import com.example.accountsservice.dto.AccountDto;
import com.example.commonlib.service.ServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final ServiceInterface<AccountDto, Long> serviceInterface;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<AccountDto> findPage() {
        return null;
    }
}
