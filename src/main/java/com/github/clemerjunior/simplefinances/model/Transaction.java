package com.github.clemerjunior.simplefinances.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private Integer id;
    private BigDecimal value;
    private String description;
    private LocalDateTime dateTime;
    private TransactionSubtype subType;
}
