package com.wangdao.day10;

import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        test(new SouthPerson("jack", 10, 1000), new NorthPerson("tom", 15, 175));
        Person person = null;
        person = new SouthPerson("jack", 10, 1000);
        if (person instanceof SouthPerson) {
            System.out.println(((SouthPerson) person).salary);
            ((SouthPerson) person).swim();
        }
    }

    public static void test(SouthPerson southPerson, NorthPerson northPerson) {
        southPerson.eat();
        northPerson.eat();
    }
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人都要吃饭");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class SouthPerson extends Person{
    double salary;

    public SouthPerson(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void eat() {
        System.out.println("南方人喜欢吃米饭");
    }

    public void swim() {
        System.out.println("游泳");
    }
}

class NorthPerson extends Person{
    double height;

    public NorthPerson(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    @Override
    public void eat() {
        System.out.println("北方人喜欢吃面食");
    }

    public void drink() {
        System.out.println("喝啤酒");
    }
}

