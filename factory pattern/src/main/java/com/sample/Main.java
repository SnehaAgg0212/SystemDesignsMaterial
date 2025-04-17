package com.sample;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = BankAccountFactory.createAccount("personal");
        System.out.println(account1.calculateInterestRate());
        
        BankAccount account2 = BankAccountFactory.createAccount("buisness");
        account2.registerAccount();
}