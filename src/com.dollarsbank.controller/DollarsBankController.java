package com.dollarsbank.controller;

import java.util.List;

import com.dollarsbank.model.*;

public class DollarsBankController {

    private Customer customer;

    // to create both a checking and savings account
    public Customer createNewAccounts(Customer customer, Double init_Deposit) {

        Account checkingAccount = new Account(customer.getUserId(), init_Deposit);
        SavingsAccount savingAccount = new SavingsAccount(customer.getUserId());

        List<Account> accounts = new ArrayList<Account>();
        accounts.add(checkingAccount);
        accounts.add(savingAccount);
        
        customer.setAccounts(accounts);
        return customer;
    }

    public Customer login(String userId, String password) {
        Customer foundCustomer = Customer.getCustomerList()
                                            .stream()
                                            .filter( c -> c.getUserId().equals(userId) 
                                                       && c.getPassword().equals(password))
                                            .findAny();
        
        return foundCustomer;
    }

}