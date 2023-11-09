package com.wangdao.day8;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Cat cat = new Cat("red", "tom", 2);
        Dog dog = new Dog("jack", 3, "black");
        cat.cry();
        dog.cry();
        cat.catchMouse();
        dog.DoorKeeper();
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void cry() {

    }
}

class Cat extends Animal{
    String color;

    public Cat(String color, String name, int age) {
        super(name, age);
        this.color = color;
    }

    public void cry() {
        System.out.println("小猫在叫");
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}

class Dog extends Animal{
    String gender;
    public void cry() {
        System.out.println("小狗在叫");
    }

    public Dog(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public void DoorKeeper() {
        System.out.println("小狗在看门");
    }
}