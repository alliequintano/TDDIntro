package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance = 0;

    int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

}
