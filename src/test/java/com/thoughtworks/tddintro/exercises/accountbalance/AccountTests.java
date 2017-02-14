package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;


public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(new BigDecimal(0));
        account.deposit(new BigDecimal(1));
        Assert.assertTrue(account.getBalance().equals(new BigDecimal(1)));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(new BigDecimal(1));
        account.withdraw(new BigDecimal(1));
        Assert.assertTrue(account.getBalance().equals(new BigDecimal(0)));
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
