package com.e_shop.dao;

import com.e_shop.connection.JdbcConnection;
import com.e_shop.model.Entity.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    public Account login(String user, String pass){
        String query = "select * from users where `username` = ? and password = ?;";
        try{
           connection = JdbcConnection.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,user);
            preparedStatement.setString(2,pass);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new Account(resultSet.getLong("id"),
                                    resultSet.getString("username"),
                                    resultSet.getString("password"),
                                    resultSet.getString("full_name"),
                                    resultSet.getString("email"),
                                    resultSet.getString("phone"),
                                    resultSet.getLong("wallet"),
                                    resultSet.getLong("role_id"),
                                    resultSet.getBoolean("is_delete"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public Account checkAccountExist(String user){
        String query = "select * from users where username = ?;";
        try{
            connection = JdbcConnection.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,user);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new Account(resultSet.getLong("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("full_name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getLong("wallet"),
                        resultSet.getLong("role_id"),
                        resultSet.getBoolean("is_delete"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void singup(String user, String pass, String fullname, String email, String phone){
        String query = "insert into  users (username, password, full_name, email, phone) values (?,?,?,?,?)";//(u) values (?,?,?,?,?,0,3,0);; // đang lỗi function này
        try{
            connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,user);
            preparedStatement.setString(2,pass);
            preparedStatement.setString(3,fullname);
            preparedStatement.setString(4,email);
            preparedStatement.setString(5,phone);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public int getTotalAccount(){
        String query = "select count(*) from users;";
        try{
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return resultSet.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

}
