package com.examly.entity;

public class OrderItem {
    private int orderId;
    private int itemId;
    private int quantity;

    public OrderItem() {}

    public OrderItem(int orderId, int itemId,int quantity){
        this.orderId= orderId;
        this.itemId= itemId;
        this.quantity= quantity;
        this.price= price;
        this.description= description;
        this.availableQuantity= availableQuantity;
    }

    public int getItemId(){return itemId;}
    public void setItemId(int itemId){this.itemId=itemId;}

    public int getRestaurantId(){return restaurantId;}
    public void setRestaurantId(String restaurantId){this.restaurantId=restaurantId;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public double getPrice(){return price;}
    public void setPrice(String price){this.price=price;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public int getAvailableQuantity(){return availableQuantity;}
    public void setAvailableQuantity(String availableQuantity){this.availableQuantity=availableQuantity;}
}