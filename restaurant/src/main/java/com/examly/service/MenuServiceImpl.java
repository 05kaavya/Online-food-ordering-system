package com.examly.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.examly.entity.Customer;
import com.examly.exception.EmailAlreadyRegisteredException;
import com.examly.exception.RestaurantNotFoundException;
import com.examly.util.DBConnectionUtil;

public class MenuServiceImpl implements MenuService{
    @Override
    public boolean creatMenuItem(MenuItem menuItem) throws RestaurantNotFoundException{
        String checkRestaurant = "SELECT COUNT(*) FROM restaurant WHERE restaurantId = ?";
        String insertItem = "INSERT INTO menuItem (restaurantId, name, price, description, availableQuantity) VALUES(?, ?, ?, ?, ?)";

        try(Connection conn = DBConnectionUtil.getConnection();
           PreparedStatement checkStmt = conn.prepareStatement(checkRestaurant);
           PreparedStatement insertStmt = conn.prepareStatement(insertItem)){ 

           checkStmt.setInt(1,menuItem.getRestaurantId());
           ResultSet rs = checkStmt.executeQuery();

           if(rs.next() && rs.getInt(1) >0){
            throw new RestaurantNotFoundException("Restaurant with ID " + menuItem.getRestaurantId() + " not found");
           }

           insertStmt.setInt(1, menuItem.getRestaurantId());
           insertStmt.setString(2, menuItem.getName());
           insertStmt.setDouble(3, menuItem.getPrice());
           insertStmt.setString(4, menuItem.getDescription());
           insertStmt.setInt(5, menuItem.getAvailableQuantity());

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
    try(Connection conn = DBConnectionUtil.getConnection());
       PreparedStatement stmt = conn.prepareStatement(sql)){
        stmt.setInt(1, restaurantId)
       }

}
}

