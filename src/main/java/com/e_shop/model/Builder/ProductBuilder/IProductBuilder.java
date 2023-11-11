package com.e_shop.model.Builder.ProductBuilder;

import com.e_shop.model.Entity.Product;

public interface IProductBuilder {
    IProductBuilder setId (long id);
    IProductBuilder setName(String name);
    IProductBuilder setImage(String image);
    IProductBuilder setPrice(long price);
    IProductBuilder setQuantity(int quantity);
    IProductBuilder setTitle(String title);
    IProductBuilder setDescription(String description);
    IProductBuilder setCategoryId(long categoryId);
    IProductBuilder setSellId(long sellId);
    IProductBuilder setAvailability(String availability);
    IProductBuilder setIsDelete(boolean isDelete);
    IProductBuilder setBrand (String brand);
    Product build();
    Product fullBuild();
}