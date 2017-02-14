package com.thoughtworks.tddintro.exercises.accountbalance;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;

    public Account (BigDecimal initalBalance) {
        this.balance = initalBalance;
    }

    BigDecimal getBalance() {
        return balance;
    }

    void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    void withdraw(BigDecimal amount) {
        BigDecimal result = balance.subtract(amount);
        if (result.compareTo(BigDecimal.ZERO) == -1) return;

        balance = result;
    }

}
