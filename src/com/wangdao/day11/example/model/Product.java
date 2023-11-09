package com.wangdao.day11.example.model;

/**
 * @description:
 * @author: 景天
 * @date: 2023/10/24 17:46
 **/

public class Product {
    private int id;
    private String name;
    private double price;
    private String brand;

    public Product(int id, String name, double price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print() {
        System.out.println("商品id: " + id + " 商品名称: " + name+
                " 商品价格: " + price + " 品牌: " + brand);
    }
}
