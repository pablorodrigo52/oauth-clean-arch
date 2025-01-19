package com.pablorodrigo52.oauth_clean_arch.infrastructure.gateways;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pablorodrigo52.oauth_clean_arch.application.gateways.TransactionGateway;
import com.pablorodrigo52.oauth_clean_arch.domain.entities.TransactionEntity;
import com.pablorodrigo52.oauth_clean_arch.infrastructure.persistence.Transaction;
import com.pablorodrigo52.oauth_clean_arch.infrastructure.persistence.TransactionRepository;

@Component
public class TransactionRepositoryGateway implements TransactionGateway {

    private final TransactionRepository transactionRepository;

    public TransactionRepositoryGateway(final TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
        initDB();
    }

    @Override
    public TransactionEntity findById(int id) throws Exception {
        Transaction transaction = transactionRepository.findById(id).orElse(null);

        if (transaction != null) {
            return TransactionMapper.toTransactionEntity(transaction);
        }

        throw new Exception("transaction not found!");
    }


    private void initDB() {
        var transactionList = List.of(
            new Transaction(1, "transaction one with clean arch", new BigDecimal(101.99)),
            new Transaction(2, "transaction two with clean arch", new BigDecimal(0.99))
        );
        transactionRepository.saveAll(transactionList);
    }
}
