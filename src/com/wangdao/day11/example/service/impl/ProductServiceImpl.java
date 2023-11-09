package com.wangdao.day11.example.service.impl;


import com.wangdao.day11.example.dao.ProductDao;
import com.wangdao.day11.example.dao.impl.ProductDaoImpl;
import com.wangdao.day11.example.model.Product;
import com.wangdao.day11.example.service.ProductService;

/**
 * @description:
 * @author: 景天
 * @date: 2023/10/25 10:05
 **/

public class ProductServiceImpl implements ProductService {
    // 需要从dao层获取数据
    // 让dao作为成员变量
    ProductDao dao = new ProductDaoImpl();
    @Override
    public Product[] findAllProducts() {
        return dao.queryAllProducts();

    }

    @Override
    public boolean createProduct(Product product) {
        return dao.createProduct(product);
    }

    @Override
    public Product findProductByID(int id) {
        return dao.queryProductByID(id);
    }

    @Override
    public Product findProductByName(String name) {
        return dao.queryProductByName(name);
    }

    @Override
    public Product updateProductByID(int id, String[] newInfo) {
        return dao.updateProductByID(id, newInfo);
    }

    @Override
    public boolean deleteProductByID(int id) {
        return dao.deleteProductByID(id);
    }
}
