package com.wangdao.day7;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        String str = ScannerUtils.inputStr();
        int num = ScannerUtils.inputInt();
        Person_ person = ScannerUtils.inputPerson();
        System.out.println("您输入的字符串为 " + str);
        System.out.println("您输入的整数为 " + num);
        System.out.println("您创建的Person_对象信息为 " + person);
    }
}

class ScannerUtils {

    static Scanner scanner = new Scanner(System.in);

    public static String inputStr() {
        System.out.print("请输入字符串: ");
        return scanner.next();
    }

    public static int inputInt() {
        System.out.print("请输入整数: ");
        return scanner.nextInt();
    }

    public static Person_ inputPerson() {
        System.out.print("请输入年龄: ");
        int age = scanner.nextInt();
        System.out.print("请输入名字: ");
        String name = scanner.next();
        return new Person_(age, name);
    }
}

class Person_ {
    int age;
    String name;

    public Person_(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person_{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}