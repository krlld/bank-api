package com.example.transactionservice.controller;

import com.example.commonlib.service.ServiceInterface;
import com.example.transactionservice.dto.TransactionDto;
import com.example.transactionservice.dto.TransactionFilterDto;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final ServiceInterface<TransactionDto, Long> serviceInterface;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<TransactionDto> findPage(
            @RequestBody(required = false) TransactionFilterDto transactionFilterDto,
            Pageable pageable
    ) {
        return serviceInterface.findPage(transactionFilterDto, pageable);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TransactionDto save(
            @Valid @RequestBody TransactionDto transactionDto
    ) {
        return serviceInterface.save(transactionDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TransactionDto update(
            @PathVariable Long id,
            @Valid @RequestBody TransactionDto transactionDto
    ) {
        transactionDto.setId(id);
        return serviceInterface.save(transactionDto);
    }
}
