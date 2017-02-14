package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class AccountTests {
    private Account account;
    BigDecimal initialBalance;

    @Before
    public void setUp() throws Exception {
        initialBalance = new BigDecimal(10);
        account = new Account(initialBalance);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        BigDecimal depositAmount = new BigDecimal(1);
        account.deposit(depositAmount);
        Assert.assertEquals(initialBalance.add(depositAmount), account.getBalance());
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        BigDecimal withdrawAmount = new BigDecimal(1);
        account.withdraw(withdrawAmount);
        Assert.assertEquals(initialBalance.subtract(withdrawAmount), account.getBalance());
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.withdraw(new BigDecimal(11));
        Assert.assertEquals(initialBalance, account.getBalance());
    }
}
