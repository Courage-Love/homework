package com.wangdao.day12;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car("奔驰", 10000000, "敞篷");
        car.startEngine();
    }
}

class Car {
    private String brand;
    private double price;
    private String model;

    public Car(String brand, double price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    class Engine {
        public void run() {
            System.out.println("汽车品牌：" + brand + " 价格：" + price + " 模型：" + model);
            System.out.println("发动机已启动");
        }
    }

    public void startEngine() {
        Engine engine = new Engine();
        engine.run();
    }

}

