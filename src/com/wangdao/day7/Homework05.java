package com.wangdao.day7;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    public static void main(String[] args) {
        Persons p = new Persons(18);
    }
}


class Persons {
    int age = 10;
    static String nationality = "美国";

    public Persons(int age) {
        this.age = age;
    }


    public Persons() {
    }

    public Persons(String nationality) {
        Persons.nationality = nationality;
    }
}