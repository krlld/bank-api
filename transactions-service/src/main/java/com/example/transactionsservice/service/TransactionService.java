package com.example.transactionsservice.service;

import com.example.commonlib.mapper.MapperService;
import com.example.commonlib.repository.RepositoryService;
import com.example.commonlib.service.AbstractService;
import com.example.transactionsservice.dto.TransactionDto;
import com.example.transactionsservice.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends AbstractService<Transaction, TransactionDto, Long> {

    public TransactionService(
            RepositoryService<Transaction, Long> repositoryService,
            MapperService<Transaction, TransactionDto> mapperService
    ) {
        super(repositoryService, mapperService);
    }

    @Override
    public TransactionDto save(TransactionDto dto) {
        return super.save(dto);
    }
}
