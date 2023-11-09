package com.wangdao.day11.example.dao;

import com.wangdao.day11.example.model.Product;

public interface ProductDao {
    Product[] queryAllProducts();

    boolean createProduct(Product product);

    Product queryProductByID(int id);

    Product queryProductByName(String name);

    Product updateProductByID(int id, String[] newInfo);

    boolean deleteProductByID(int id);
}
