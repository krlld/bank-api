package com.example.accountsservice.service;

import com.example.accountsservice.dto.AccountDto;
import com.example.accountsservice.model.Account;
import com.example.commonlib.mapper.MapperService;
import com.example.commonlib.repository.RepositoryService;
import com.example.commonlib.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends AbstractService<Account, AccountDto, Long> {

    public AccountService(
            RepositoryService<Account, Long> repositoryService,
            MapperService<Account, AccountDto> mapperService
    ) {
        super(repositoryService, mapperService);
    }
}
