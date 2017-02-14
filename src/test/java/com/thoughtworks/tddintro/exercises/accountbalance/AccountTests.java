package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
        int initialBalance = account.getBalance();
        account.deposit(1);
        Assert.assertTrue(initialBalance < account.getBalance());
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
