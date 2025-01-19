package com.pablorodrigo52.oauth_clean_arch.application.usecases;

import org.springframework.stereotype.Component;

import com.pablorodrigo52.oauth_clean_arch.application.gateways.TransactionGateway;
import com.pablorodrigo52.oauth_clean_arch.domain.entities.TransactionEntity;

@Component
public class GetTransactionUsecase {
 
    private final TransactionGateway transactionGateway;

    public GetTransactionUsecase(final TransactionGateway transactionGateway) {
        this.transactionGateway = transactionGateway;
    }

    public TransactionEntity getTransactionById(final int id) throws Exception {
        return transactionGateway.findById(id);
    }
}
