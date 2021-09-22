package com.dollarsbank.model;

public class SavingsAccount extends Account {
    
    private String accountId;
    private double balance;

    public SavingsAccount(String accountId){
        this.accountId = "S" + accountId;
        this.balanace = 0.00;
    }

    @Override
    public String getAccountType() {
        return "SAVINGS";
    }
    
}
