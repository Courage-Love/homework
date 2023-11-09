package com.wangdao.day13;

import java.util.Objects;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(10, "jack", 500);
        Animal animal2 = new Animal(10, "jack", 500);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.hashCode() == animal2.hashCode());
    }
}

class Animal {
    int age;
    String name;
    double price;

    public Animal(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        // 自反性
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        // 排他性
        if (o == null || !(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(animal.price, price) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, price);
    }
}
