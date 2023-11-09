package com.wangdao.day11.example.model;

/**
 * @description:
 * @author: 景天
 * @date: 2023/10/24 17:50
 **/
// 模拟数据库的数据
public class ProductData {
    public static final Product[] PRODUCTS = new Product[10];

    static {
        // 初始化操作
        PRODUCTS[0] = new Product(1, "鼠标", 199, "罗技");
        PRODUCTS[1] = new Product(2, "手机", 1999, "小米");
        PRODUCTS[2] = new Product(3, "篮球鞋", 899, "AJ");
        PRODUCTS[3] = new Product(4, "可口可乐", 3, "可口可乐");
    }
}
