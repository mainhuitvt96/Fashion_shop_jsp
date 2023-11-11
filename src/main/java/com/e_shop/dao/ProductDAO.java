package com.e_shop.dao;

import com.e_shop.connection.JdbcConnection;
import com.e_shop.model.Builder.ProductBuilder.ProductConcreteBuilder;
import com.e_shop.model.Entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public List<Product> getAllProduct(){
        List<Product> listProducts = new ArrayList<>();
        String query = "SELECT * FROM products;";
        try {
             Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                listProducts.add(new ProductConcreteBuilder()
                                .setId(resultSet.getLong("id"))
                                .setName(resultSet.getString("name"))
                                .setImage(resultSet.getString("image"))
                                .setPrice(resultSet.getLong("price"))
                                .setQuantity(resultSet.getInt("quantity"))
                                .setTitle(resultSet.getString("title"))
                                .setDescription(resultSet.getString("description"))
                                .setCategoryId(resultSet.getLong("category_id"))
                                .setSellId(resultSet.getLong("sell_id"))
                                .setAvailability(resultSet.getString("availability"))
                                .setIsDelete(resultSet.getBoolean("is_delete"))
                                .setBrand(resultSet.getString("brand")).fullBuild());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProducts;
    }
    public List<Product> getProductByCategoryId(String cid){
        List<Product> listProducts = new ArrayList<>();
        String query = "SELECT * FROM products where category_id = ?;";
        try {
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                listProducts.add(new ProductConcreteBuilder()
                        .setId(resultSet.getLong("id"))
                        .setName(resultSet.getString("name"))
                        .setImage(resultSet.getString("image"))
                        .setPrice(resultSet.getLong("price"))
                        .setQuantity(resultSet.getInt("quantity"))
                        .setTitle(resultSet.getString("title"))
                        .setDescription(resultSet.getString("description"))
                        .setCategoryId(resultSet.getLong("category_id"))
                        .setSellId(resultSet.getLong("sell_id"))
                        .setAvailability(resultSet.getString("availability"))
                        .setIsDelete(resultSet.getBoolean("is_delete"))
                        .setBrand(resultSet.getString("brand")).fullBuild());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProducts;
    }
    public Product getProductById(long id){
        String query = "SELECT * FROM products where category_id = ?;";
        try {
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new ProductConcreteBuilder()
                        .setId(resultSet.getLong("id"))
                        .setName(resultSet.getString("name"))
                        .setImage(resultSet.getString("image"))
                        .setPrice(resultSet.getLong("price"))
                        .setQuantity(resultSet.getInt("quantity"))
                        .setTitle(resultSet.getString("title"))
                        .setDescription(resultSet.getString("description"))
                        .setCategoryId(resultSet.getLong("category_id"))
                        .setSellId(resultSet.getLong("sell_id"))
                        .setAvailability(resultSet.getString("availability"))
                        .setIsDelete(resultSet.getBoolean("is_delete"))
                        .setBrand(resultSet.getString("brand")).fullBuild();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public List<Product> searchByName (String txtSearch){
        List<Product> listProducts = new ArrayList<>();
        String query = "SELECT * FROM products where name like ?;";
        try {
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + txtSearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                listProducts.add(new ProductConcreteBuilder()
                        .setId(resultSet.getLong("id"))
                        .setName(resultSet.getString("name"))
                        .setImage(resultSet.getString("image"))
                        .setPrice(resultSet.getLong("price"))
                        .setQuantity(resultSet.getInt("quantity"))
                        .setTitle(resultSet.getString("title"))
                        .setDescription(resultSet.getString("description"))
                        .setCategoryId(resultSet.getLong("category_id"))
                        .setSellId(resultSet.getLong("sell_id"))
                        .setAvailability(resultSet.getString("availability"))
                        .setIsDelete(resultSet.getBoolean("is_delete"))
                        .setBrand(resultSet.getString("brand")).fullBuild());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProducts;
    }
    public Product getLast(){
        String query = "select top 1 * from product order by id desc";
        try {
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new ProductConcreteBuilder()
                        .setId(resultSet.getLong("id"))
                        .setName(resultSet.getString("name"))
                        .setImage(resultSet.getString("image"))
                        .setPrice(resultSet.getLong("price"))
                        .setQuantity(resultSet.getInt("quantity"))
                        .setTitle(resultSet.getString("title"))
                        .setDescription(resultSet.getString("description"))
                        .setCategoryId(resultSet.getLong("category_id"))
                        .setSellId(resultSet.getLong("sell_id"))
                        .setAvailability(resultSet.getString("availability"))
                        .setIsDelete(resultSet.getBoolean("is_delete"))
                        .setBrand(resultSet.getString("brand")).fullBuild();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public List<Product> getProductBySellId(long sellId){
        List<Product> listProducts = new ArrayList<>();
        String query = "SELECT * FROM products where sell_id = ?;";
        try {
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, sellId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                listProducts.add(new ProductConcreteBuilder()
                        .setId(resultSet.getLong("id"))
                        .setName(resultSet.getString("name"))
                        .setImage(resultSet.getString("image"))
                        .setPrice(resultSet.getLong("price"))
                        .setQuantity(resultSet.getInt("quantity"))
                        .setTitle(resultSet.getString("title"))
                        .setDescription(resultSet.getString("description"))
                        .setCategoryId(resultSet.getLong("category_id"))
                        .setSellId(resultSet.getLong("sell_id"))
                        .setAvailability(resultSet.getString("availability"))
                        .setIsDelete(resultSet.getBoolean("is_delete"))
                        .setBrand(resultSet.getString("brand")).fullBuild());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProducts;
    }
    public void deleteProductById(String pid) {
        String query = "SELECT * FROM products where id = ?;";
        try {
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pid);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Product>  getBrandOfProduct(){
        List<Product> listProducts = new ArrayList<>();
        String query = "select brand, id from products;";
        try {
            Connection connection = JdbcConnection.getConnection(); //Tạo kết nối với DB
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                listProducts.add(new Product(resultSet.getString("brand"),
                        resultSet.getLong("id")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listProducts;
    }
//    public static void main(String[] args) {
//        ProductDAO productDAO = new ProductDAO();
//        List<Product> list = productDAO.getProductByCategoryId(1);
//        Product product = productDAO.getProductById("1");
//        List<Product> list = productDAO.searchByName("liền quần ");
//        for (Product p: list){
//            System.out.println(p);
//        }
//        System.out.println(product);
//
//    }
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
       List<Product> productList= productDAO.getProductBySellId(3);
        for (Product product: productList){
            System.out.println(product);
        }
    }
}


















