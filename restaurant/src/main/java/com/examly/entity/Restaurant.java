package com.examly.entity;

public class Restaurant {
    private int restaurantId;
    private String name;
    private String address;
    private String cuisineType;
    private String contactNumber;
   
    

    public Restaurant() {}

    public Restaurant(int restaurantId, String name, String address, String cuisineType, String contactNumber){
        
        this.restaurantId= restaurantId;
        this.name= name;
        this.address= address;
        this.cuisineType= cuisineType;
        this.contactNumber= contactNumber;
    }

    
    public int getRestaurantId(){return restaurantId;}
    public void setRestaurantId(int restaurantId){this.restaurantId=restaurantId;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.deliveryAddress=deliveryAddress;}

    public int getOrderId(){return orderId;}
    public void setOrderId(int orderId){this.orderId=orderId;}

    public int getCustomerId(){return customerId;}
    public void setCustomerId(int customerId){this.customerId=customerId;}
}