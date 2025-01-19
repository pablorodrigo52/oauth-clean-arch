package com.pablorodrigo52.oauth_clean_arch.application.gateways;

import com.pablorodrigo52.oauth_clean_arch.domain.entities.TransactionEntity;

public interface TransactionGateway {
    TransactionEntity findById(int id) throws Exception;
}
