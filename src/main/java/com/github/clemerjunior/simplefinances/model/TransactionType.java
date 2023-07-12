package com.github.clemerjunior.simplefinances.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TransactionType {

    IN(1, "Income"),
    OUT(2, "Outcome");

    private int id;
    private String description;
}
