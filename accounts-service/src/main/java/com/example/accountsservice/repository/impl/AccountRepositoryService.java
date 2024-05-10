package com.example.accountsservice.repository.impl;

import com.example.accountsservice.model.Account;
import com.example.commonlib.repository.AbstractRepositoryService;
import com.example.commonlib.repository.BaseRepository;
import com.example.commonlib.specification.SpecificationBuilder;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryService extends AbstractRepositoryService<Account, Long> {

    public AccountRepositoryService(
            BaseRepository<Account, Long> repository,
            SpecificationBuilder<Account> specificationBuilder
    ) {
        super(repository, specificationBuilder);
    }
}
