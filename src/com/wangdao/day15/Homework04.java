package com.wangdao.day15;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) {
        Cat c = new Cat(1, "小黄", 100);
        Cat c1 = new Cat(2, "小黑", 200);
        Cat c2 = new Cat(2, "貉", 2000);
        Cat c3 = new Cat(2, "马云的猫", 10000);
        Cat c4 = new Cat(2, "云哥", 8000);
        Cat c5 = new Cat(3, "吉祥物", 800);
        Cat c6 = new Cat(2, "阿修罗", 9000);
        Cat c7 = new Cat(2, "云堇", 300);
        Cat c8 = new Cat(2, "咪咪", 400);
        Cat c9 = new Cat(8, "养乐多", 500);
        Cat[] cats = {c, c1, c2, c3, c4, c5, c6, c7, c8, c9};
//        Arrays.sort(cats, new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                if (o1.age == o2.age && o1.name.length() == o2.name.length()) {
//                    return (int)(o2.price - o1.price);
//                }
//                if (o1.age == o1.age) {
//                    return o1.name.length() - o2.name.length();
//                }
//                return o1.age - o2.age;
//            }
//        });
        Arrays.sort(cats, Cat::compareTo);
        System.out.println(Arrays.toString(cats));

    }
}

class Cat implements Comparable<Cat> {
    int age;
    String name;
    double price;

    public Cat(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Cat o) {
//        return (int)(o.price - price);
//        return name.length() - o.name.length();
        if (age == o.age && name.length() == o.name.length()) {
            return (int)(o.price - price);
        }
        if (age == o.age) {
            return name.length() - o.name.length();
        }
        return age - o.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }
}

