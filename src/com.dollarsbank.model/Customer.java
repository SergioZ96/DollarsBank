package com.dollarsbank.model;

import java.util.List;

public class Customer {

    // class attributes
    private static List<Customer> customerList;
    
    // Customer attributes
    private String name;
    private String address;
    private int phone;
    private String userId;
    private String password;
    private List<Account> accounts;
    private List<String> transactions;


    // default constructor
    public Customer(){

    }

    // constructor if there aren't any initial accounts
    public Customer(String name, String address, int phone, String userId, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.userId = userId;
        this.password = password;
        customerList.add(this);
    }


    public Customer(String name, String address, int phone, String userId, String password, List<Account> accounts, List<String> transactions) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.userId = userId;
        this.password = password;
        this.accounts = accounts;
        customerList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        Customer.customerList = customerList;
    }

    
}
