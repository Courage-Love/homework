package com.wangdao.day13;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        Class c1 = new A().getClass();
        Class c2 = new A().getClass();
        Class c3 = new B().getClass();
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

        System.out.println(m1(c1, c3));
    }

    public static boolean m1(Object o1, Object o2) {
        return o1 == o2 ? true : false;

    }
}

class A {

}

class B {

}