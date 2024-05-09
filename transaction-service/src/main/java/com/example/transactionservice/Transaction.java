package com.example.transactionservice;

import com.example.commonlib.entity.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@Accessors(chain = true)
public class Transaction extends AbstractEntity {

    private Long senderAccountId;

    private Long recipientAccountId;

    private BigDecimal amount;

    private String additionalInfo;
}
