package com.example.accountsservice.specification;

import com.example.accountsservice.model.Account;
import com.example.commonlib.dto.FilterRequest;
import com.example.commonlib.specification.SpecificationBuilder;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class AccountSpecificationBuilder implements SpecificationBuilder<Account> {

    @Override
    public Specification<Account> build(FilterRequest filterRequest) {
        return (root, query, builder) -> builder.and();
    }
}
