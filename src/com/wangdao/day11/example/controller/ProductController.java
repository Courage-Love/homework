package com.wangdao.day11.example.controller;


import com.wangdao.day11.example.model.Product;
import com.wangdao.day11.example.service.ProductService;
import com.wangdao.day11.example.service.impl.ProductServiceImpl;

/**
 * @description:
 * @author: 景天
 * @date: 2023/10/25 9:56
 **/

public class ProductController {

    // 请求ProductService的功能
    // 需要ProductService作为成员变量
    ProductService service = new ProductServiceImpl();
    public Product[] findAllProducts() {
        return service.findAllProducts();

    }

    public boolean createProduct(Product product) {
        return service.createProduct(product);
    }

    public Product findProductByID(int id) {
        return service.findProductByID(id);
    }

    public Product findProductByName(String name) {
        return service.findProductByName(name);
    }

    public Product updateProductByID(int id, String[] newInfo) {
        return service.updateProductByID(id, newInfo);
    }

    public boolean deleteProductByID(int id) {
        return service.deleteProductByID(id);
    }
}
