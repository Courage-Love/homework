package com.wangdao.day11.example.service;

import com.wangdao.day11.example.model.Product;

public interface ProductService {
    Product[] findAllProducts();

    boolean createProduct(Product product);

    Product findProductByID(int id);

    Product findProductByName(String name);

    Product updateProductByID(int id, String[] newInfo);

    boolean deleteProductByID(int id);
}
