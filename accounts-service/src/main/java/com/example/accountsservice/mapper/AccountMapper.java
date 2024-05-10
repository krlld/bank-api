package com.example.accountsservice.mapper;

import com.example.accountsservice.dto.AccountDto;
import com.example.accountsservice.model.Account;
import com.example.commonlib.mapper.MapperService;
import org.mapstruct.Mapper;

@Mapper
public interface AccountMapper extends MapperService<Account, AccountDto> {

}
