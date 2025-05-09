package com.examly.entity;

public class Order {
    private int orderId;
    private int customerId;
    private int restaurantId;
    private String orderStatus;
    private double totalPrice;
    private String deliveryAddress;
    

    public Order() {}

    public Order(int orderId, int customerId, int restaurantId, String orderStatus, double totalPrice, String deliveryString){
        this.orderId= orderId;
        this.customerId= customerId;
        this.restaurantId= restaurantId;
        this.orderStatus= orderStatus;
        this.totalPrice= phoneNumber;
        this.password= password;
    }

    public int getCustomerId(){return customerId;}
    public void setCustomerId(int customerId){this.customerId=customerId;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password=password;}
}