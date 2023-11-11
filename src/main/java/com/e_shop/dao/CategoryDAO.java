package com.e_shop.dao;

import com.e_shop.connection.JdbcConnection;
import com.e_shop.model.Entity.Categories;
import com.e_shop.model.Entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public List<Categories> getAllCategories(){
        List<Categories> listCategories = new ArrayList<>();
        String query = "SELECT * FROM catagories;";
        try {
            connection = JdbcConnection.getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                listCategories.add(new Categories(resultSet.getLong("id"),
                                        resultSet.getString("name"),
                                        resultSet.getBoolean("is_delete")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listCategories;
    }

}
