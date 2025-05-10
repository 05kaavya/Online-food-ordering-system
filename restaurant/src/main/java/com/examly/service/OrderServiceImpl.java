package com.examly.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.examly.entity.Order;
import com.examly.entity.OrderItem;
import com.examly.util.DBConnectionUtil;

public class OrderServiceImpl implements OrderService{
    @Override
    public boolean createOrder(Order order, List<OrderItem> orderedItems) {
        String insertOrder = "INSERT INTO 'order' (orderId, customerId, restaurantId, orderStatus, totalPrice, deliveryAddress) VALUES(?, ?, ?, ?, ?, ?)";
        String insertItem = "INSERT INTO orderItem (orderId, itemId, quantity) VALUES(?, ?, ?)";

        try(Connection conn = DBConnectionUtil.getConnection();
           PreparedStatement orderStmt = conn.prepareStatement(insertOrder);
           PreparedStatement insertStmt = conn.prepareStatement(insertOrderItem);
           ){ 

           conn.setAutoCommit(false);
           orderStmt.setInt(1, order.getOrderId());
           orderStmt.setInt(2, order.getCustomerId());
           orderStmt.setInt(3, order.getRestaurantId());
           orderStmt.setString(4, order.getOrderStatus());
           orderStmt.setDouble(5, order.getTotalPrice());
           orderStmt.setString(6, order.getDeliveryAddress());
           int orderRows = orderStmt.executeUpdate();

           for(OrderItem item : orderedItems){

           insertStmt.setInt(1, item.getOrderId());
           insertStmt.setInt(2, item.getItemId());
           insertStmt.setInt(3, item.getQuantity());
           itemStmt
           }

           return insertStmt.executeUpdate() > 0;
    }catch(SQLException e){
        e.printStackTrace();
        return false;
    }
}

@Override
public List<MenuItem> getMenuItemsByRestaurant(int restaurantId){
    List<MenuItem> menuItems = new ArrayList<>();
    String sql = "SELECT * FROM menuItem WHERE restaurantId = ?";
    try(Connection conn = DBConnectionUtil.getConnection();
       PreparedStatement stmt = conn.prepareStatement(sql)){
        stmt.setInt(1, restaurantId);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            MenuItem item = new MenuItem(
                rs.getInt("itemId"),
                rs.getInt("restaurantId"),
                rs.getString("name"),
                rs.getDouble("price"),
                rs.getString("description"),
                rs.getInt("availableQuantity"));

            menuItems.add(item);    


            
           }
       }catch(SQLException e){
        e.printStackTrace();
       }
       return menuItems;

}
}
