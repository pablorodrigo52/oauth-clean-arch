package com.pablorodrigo52.oauth_clean_arch.infrastructure.controller.dto;

import java.math.BigDecimal;

public record GetTransactionResponse(int id, String description, BigDecimal amount){}