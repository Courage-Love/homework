package com.wangdao.day9;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Son son = new Son();
        Grandfather grandfather = new Son();
        Father father = new Son();
        grandfather.testGrand();
        father.test();
        son.testSon();
        son.testGrand();
        son.test();

    }

    public void m2() throws CloneNotSupportedException {
        Object clone = this.clone();
        this.clone();
    }

}

class Grandfather {
    int gA = 1;
    int a = 1;

    public void testGrand() {
        System.out.println("testGrand");
    }

    public void test() {
        System.out.println("grandfather_test");
    }

    public Grandfather() {
    }

    public Grandfather(int gA) {
        this.gA = gA;
    }

    public Grandfather(int gA, int a) {
        this.gA = gA;
        this.a = a;
    }
    public static void m2() {

    }
}

class Father extends Grandfather{
    int fA = 2;
    int a = 2;

    public void testFather() {
        System.out.println("testFather");
    }

    public void test() {
        System.out.println("father_test");
    }

    public Father() {
    }

    public Father(int fA) {
        this.fA = fA;
    }

    public Father(int fA, int a) {
        this.fA = fA;
        this.a = a;
    }

}


class Son extends Father{
    int sA = 3;
    int a = 3;

    public void testSon() {
        System.out.println("testSon");
    }

    public void test() {
        System.out.println("son_test");
    }

    public Son() {
    }

    public Son(int sA) {
        this.sA = sA;
    }

    public Son(int sA, int a) {
        this.sA = sA;
        this.a = a;
    }
}
