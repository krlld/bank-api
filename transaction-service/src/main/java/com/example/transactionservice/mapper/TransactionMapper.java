package com.example.transactionservice.mapper;

import com.example.commonlib.mapper.MapperService;
import com.example.transactionservice.dto.TransactionDto;
import com.example.transactionservice.model.Transaction;
import org.mapstruct.Mapper;

@Mapper
public interface TransactionMapper extends MapperService<Transaction, TransactionDto> {

}
