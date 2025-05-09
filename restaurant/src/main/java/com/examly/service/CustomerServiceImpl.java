package com.examly.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.examly.entity.Customer;
import com.examly.exception.EmailAlreadyRegisteredException;
import com.examly.util.DBConnectionUtil;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public boolean createCustomer(Customer customer) throws EmailAlreadyRegisteredException{
        String checkQuery = "SELECT COUNT(*) FROM customer WHERE email=?";
        String insertQuery = "INSERT INTO customer (name, email, phoneNumber, password) VALUES(?,?,?,?)";

        try(Connection conn = DBConnectionUtil.getConnection())
    }
    
}
