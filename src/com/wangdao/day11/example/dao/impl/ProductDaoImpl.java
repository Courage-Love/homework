package com.wangdao.day11.example.dao.impl;


import com.wangdao.day11.example.dao.ProductDao;
import com.wangdao.day11.example.model.Product;
import com.wangdao.day11.example.model.ProductData;

/**
 * @description:
 * @author: 景天
 * @date: 2023/10/25 10:11
 **/

public class ProductDaoImpl implements ProductDao {
    // 模拟数据库作为数据源
    private static Product[] products = ProductData.PRODUCTS;

    @Override
    public Product[] queryAllProducts() {
        return products;
    }

    @Override
    public boolean createProduct(Product product) {
        // 商品id唯一 不能重复
        // 遍历数组
        for (Product p : products) {
            if (p != null) {
                if (p.getId() == product.getId()) {
                    // 看看有没有重复的
                    // 返回false
                    return false;
                }
            }
        }
        // 没有重复
        // 找到一个空的位置 放进去
        for (int i = 0; i < products.length; i++) {
            // null判断
            if (products[i] == null) {
                products[i] = product;
                return true;
            }
        }
        // 满了 false
        return false;
    }

    @Override
    public Product queryProductByID(int id) {
        Product product = null;
        // 遍历数组
        for (Product p : products) {
            // 根据id比较
            if (p != null) {
                if (p.getId() == id) {
                    product = p;
                }
            }
        }

        return product;
    }

    @Override
    public Product queryProductByName(String name) {
        Product product = null;
        // 遍历数组
        for (Product p : products) {
            if (p != null) {
                if (name.equals(p.getName())) {
                    // 比较商品名称
                    product = p;
                }
            }
        }
        return product;
    }

    @Override
    public Product updateProductByID(int id, String[] newInfo) {
        Product product = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getId() == id) {
                    products[i].setName(newInfo[0]);
                    products[i].setPrice(Integer.parseInt(newInfo[1]));
                    products[i].setBrand(newInfo[2]);
                    product = products[i];
                }
            }
        }
        return product;
    }

    @Override
    public boolean deleteProductByID(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getId() == id) {
                    products[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
