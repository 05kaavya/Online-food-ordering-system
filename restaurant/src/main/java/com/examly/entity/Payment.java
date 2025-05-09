package com.examly.entity;

public class Payment {
    private int paymentId;
    private int orderId;
    private Date paymentDate;
    private String paymentStatus;
    private double amountPaid;
    
    

    public Payment() {}

    public Payment(int paymentId,int orderId,Date paymentDate, String paymentStatus, double amountPaid){
        this.paymentId= paymentId;
        this.orderId= orderId;
        this.paymentDate= paymentDate;
        this.paymentStatus= paymentStatus;
        this.amountPaid= amountPaid;
        
    }

    public int getPaymentId(){return paymentId;}
    public void setPaymentId(int paymentId){this.paymentId=paymentId;}

    public int getOrderId(){return orderId;}
    public void setOrderId(int orderId){this.orderId=orderId;}

    
    public Date getPaymentDate(){return paymentDate;}
    public void setPaymentDate(int paymentDate){this.paymentDate=paymentDate;}

    public String getPaymentStatus(){return paymentStatus;}
    public void setPaymentStatus(String paymentStatus){this.paymentStatus=paymentStatus;}

    public double getTotalPrice(){return totalPrice;}
    public void setTotalPrice(double totalPrice){this.totalPrice=totalPrice;}

    public String getDeliveryAddress(){return deliveryAddress;}
    public void setDeliveryAddress(String deliveryAddress){this.deliveryAddress=deliveryAddress;}
}