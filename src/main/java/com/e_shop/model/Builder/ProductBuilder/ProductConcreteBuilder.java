package com.e_shop.model.Builder.ProductBuilder;

import com.e_shop.model.Entity.Product;

public class ProductConcreteBuilder implements IProductBuilder{
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

    @Override
    public IProductBuilder setId(long id) {
        this.id = id;
        return this;
    }

    @Override
    public IProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IProductBuilder setImage(String image) {
        this.image = image;
        return  this;
    }

    @Override
    public IProductBuilder setPrice(long price) {
        this.price = price;
         return  this;
    }

    @Override
    public IProductBuilder setQuantity(int quantity) {
        this.quantity = quantity;
         return  this;
    }

    @Override
    public IProductBuilder setTitle(String title) {
        this.title = title;
         return  this;
    }

    @Override
    public IProductBuilder setDescription(String description) {
        this.description = description;
        return  this;
    }

    @Override
    public IProductBuilder setCategoryId(long categoryId) {
       this.categoryId = categoryId;
       return  this;
    }

    @Override
    public IProductBuilder setSellId(long sellId) {
        this.sellId = sellId;
        return this;
    }
    @Override
    public IProductBuilder setAvailability(String availability) {
       this.availability = availability;
       return  this;
    }

    @Override
    public IProductBuilder setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
         return  this;
    }

    @Override
    public IProductBuilder setBrand(String brand) {
        this.brand = brand;
         return  this;
    }

    @Override
    public Product build() {
        return new Product(name,image, price, quantity, title, description,
                categoryId, sellId, availability, isDelete, brand);
    }

    @Override
    public Product fullBuild() {
        return new Product(id, name, image, price, quantity, title, description, categoryId, sellId, availability, isDelete, brand);
    }
}
