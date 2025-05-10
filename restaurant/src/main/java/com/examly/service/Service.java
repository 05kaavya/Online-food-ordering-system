package com.examly.service;

import java.util.List;
import com.examly.entity.Restaurant;


public interface RestaurService {
    boolean createOrder(Order order, List<OrderItem> orderedItems) ;
    List<Order> getOrdersByCustomer(int customerId);
    Order getOrderById(int orderId);
    
}
