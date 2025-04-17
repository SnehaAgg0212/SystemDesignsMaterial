package com.sample.accounts;

import java.lang.System;

@BankAccountType("personal")
public class PersonalAccount implements BankAccount{
    @overrides
    boolean validateUserIdentity(){
        System.out.println("Personal bank account validation");
        return true;
    }

    @overrides
    float calculateInterestRate(){
        return float(20.00);
    }

    @overrides
    void registerAccount(){
        System.out.println("Personal bank account registeration");
    }
}