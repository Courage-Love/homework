package com.wangdao.day16;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) throws MyException {
        test();
    }

    public static void test() throws MyException {
        throw new MyException();
//        throw new MyException2();
    }
}

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

class MyException2 extends RuntimeException {
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}
