package com.wangdao.day6;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        item1.type = "手机类";
        item1.name = "Samsung Galaxy S21";
        item1.price = 8000;
        item2.type = "家具类";
        item2.name = "海尔冰箱";
        item2.price = 3000;
        item3.type = "日用品类";
        item3.name = "海飞丝洗发水";
        item3.price = 30;
        double balance = item1.sale(10000);
        if (balance == -1){
            System.out.println("金钱不足，购买失败！");
        } else {
            System.out.println("找零 " + balance + " 元");
        }
    }
}

class Item {
    String name;
    double price;
    String type;

    public double sale(double money) {
        double balance = -1;
        if (money >= price) {
            System.out.println(name + " 被卖出!");
            balance = money - price;
        }
        return balance;
    }
}
