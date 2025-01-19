package com.pablorodrigo52.oauth_clean_arch.infrastructure.gateways;

import com.pablorodrigo52.oauth_clean_arch.domain.entities.TransactionEntity;
import com.pablorodrigo52.oauth_clean_arch.infrastructure.persistence.Transaction;

public class TransactionMapper {
    public static TransactionEntity toTransactionEntity(Transaction transaction) {
        return new TransactionEntity(transaction.getId(), transaction.getDescription(), transaction.getAmount());
    }
}
