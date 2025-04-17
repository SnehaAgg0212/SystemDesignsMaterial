package com.sample.accounts;

import java.lang.System;

@BankAccountType("buisness")
public class PersonalAccount implements BankAccount{
    @overrides
    boolean validateUserIdentity(){
        System.out.println("Buisness bank account validation");
        return true;
    }

    @overrides
    float calculateInterestRate(){
        return float(10.00);
    }

    @overrides
    void registerAccount(){
        System.out.println("Buisness bank account registeration");
    }
}