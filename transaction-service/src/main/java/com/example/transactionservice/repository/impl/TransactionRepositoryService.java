package com.example.transactionservice.repository.impl;

import com.example.commonlib.repository.AbstractRepositoryService;
import com.example.commonlib.repository.BaseRepository;
import com.example.commonlib.specification.SpecificationBuilder;
import com.example.transactionservice.model.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepositoryService extends AbstractRepositoryService<Transaction, Long> {

    public TransactionRepositoryService(
            BaseRepository<Transaction, Long> repository,
            SpecificationBuilder<Transaction> specificationBuilder
    ) {
        super(repository, specificationBuilder);
    }
}
