package com.examly.entity;

public class MenuItem {
    private int itemId;
    private int restaurantId;
    private String name;
    private double price;
    private String description;
    private int availableQuantity;

    public MenuItem() {}

    public MenuItem(int itemId, int restaurantId,String name, double price, String description , int availableQuantity){
        this.itemId= itemId;
        this.restaurantId= restaurantId;
        this.name= name;
        this.price= price;
        this.description= description;
        this.availableQuantity= availableQuantity;
    }

    public int getItemId(){return itemId;}
    public void setItemId(int itemId){this.itemId=itemId;}

    public int getRestaurantId(){return restaurantId;}
    public void setRestaurantId(String restaurantId){this.name=name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password=password;}
}