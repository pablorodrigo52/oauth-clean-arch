package com.pablorodrigo52.oauth_clean_arch.domain.entities;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class TransactionEntity {
    private int id;
    private String description;
    private BigDecimal amount;


    public TransactionEntity(){
    }

    public TransactionEntity(int id, String description, BigDecimal amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
