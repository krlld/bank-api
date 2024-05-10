package com.example.transactionsservice.mapper;

import com.example.commonlib.mapper.MapperService;
import com.example.transactionsservice.dto.TransactionDto;
import com.example.transactionsservice.model.Transaction;
import org.mapstruct.Mapper;

@Mapper
public interface TransactionMapper extends MapperService<Transaction, TransactionDto> {

}
