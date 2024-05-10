package com.example.transactionsservice.specification;

import com.example.commonlib.dto.FilterRequest;
import com.example.commonlib.specification.SpecificationBuilder;
import com.example.transactionsservice.model.Transaction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class TransactionSpecificationBuilder implements SpecificationBuilder<Transaction> {

    @Override
    public Specification<Transaction> build(@Nullable FilterRequest filterRequest) {
        if (filterRequest == null) {
            return (root, query, builder) -> builder.and();
        }
        // TODO
        return null;
    }
}
