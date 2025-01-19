package com.pablorodrigo52.oauth_clean_arch.infrastructure.controller;

import com.pablorodrigo52.oauth_clean_arch.domain.entities.TransactionEntity;

public class TransactionDTOMapper {
    public static GetTransactionResponse toGetTransactionResponse(TransactionEntity transactionEntity) {
        return new GetTransactionResponse(
            transactionEntity.getId(), 
            transactionEntity.getDescription(), 
            transactionEntity.getAmount());
    }
}