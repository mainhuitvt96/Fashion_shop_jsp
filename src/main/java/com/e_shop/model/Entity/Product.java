package com.e_shop.model.Entity;

public class Product {
    private long id;
    private String name;
    private String image;
    private long price;
    private int quantity;
    private String title;
    private String description;
    private long categoryId;
    private long sellId;
    private String availability;
    private boolean isDelete;
    private String brand;
    public Product(){}

    public Product(long id, String name, String image,long price, int quantity, String title, String description,
                   long categoryId, long sellId, String availability, boolean isDelete, String brand) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.sellId = sellId;
        this.availability = availability;
        this.isDelete = isDelete;
        this.brand = brand;
    }

    public Product(String name, String image, long price, int quantity, String title, String description,
                   long categoryId, long sellId, String availability, boolean isDelete, String brand) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.sellId = sellId;
        this.availability = availability;
        this.isDelete = isDelete;
        this.brand = brand;
    }

    public Product(String brand, long id) {
        this.id = id;
        this.brand = brand;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public long getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public long getSellId() {
        return sellId;
    }

    public String getAvailability() {
        return availability;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public void setSellId(long sellId) {
        this.sellId = sellId;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", sellId=" + sellId +
                ", availability=" + availability +
                ", isDelete=" + isDelete +
                ", brand='" + brand + '\'' +
                '}';
    }
}
