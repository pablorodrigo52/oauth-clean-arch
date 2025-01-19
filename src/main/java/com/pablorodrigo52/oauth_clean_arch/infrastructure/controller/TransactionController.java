package com.pablorodrigo52.oauth_clean_arch.infrastructure.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pablorodrigo52.oauth_clean_arch.application.usecases.GetTransactionUsecase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final GetTransactionUsecase getTransactionUsecase;

    public TransactionController(final GetTransactionUsecase getTransactionUsecase) {
        this.getTransactionUsecase = getTransactionUsecase;
    }

    @GetMapping("/{id}")
    public GetTransactionResponse getTransaction(@PathVariable("id") int id) throws Exception {
        return TransactionDTOMapper.toGetTransactionResponse(
            getTransactionUsecase.getTransactionById(id));
    }    
}
