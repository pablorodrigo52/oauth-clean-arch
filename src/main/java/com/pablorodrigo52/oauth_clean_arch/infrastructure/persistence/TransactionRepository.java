package com.pablorodrigo52.oauth_clean_arch.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
