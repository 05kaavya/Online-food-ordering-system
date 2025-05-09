package com.examly.entity;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public Customer() {}

    public Customer(int customerId, String name, String email, String phoneNumber, String password){
        this.customerId= customerId;
        this.name= name;
        this.email= email;
        this.phoneNumber= phoneNumber;
        this.password= password;
    }

    public int getCustomerId(){return customerId;}
    public void setCustomerId(int)
}