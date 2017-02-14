package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class AccountTests {
    private Account account;

    @Before
    public void setUp() throws Exception {
        BigDecimal initialBalance = new BigDecimal(10);
        account = new Account(initialBalance);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        account.deposit(new BigDecimal(1));
        BigDecimal newBalance = account.getBalance();
        Assert.assertTrue(newBalance.equals(new BigDecimal(11)));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        account.withdraw(new BigDecimal(1));
        BigDecimal newBalance = account.getBalance();
        Assert.assertTrue(newBalance.equals(new BigDecimal(9)));
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
