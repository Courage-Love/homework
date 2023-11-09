package com.wangdao.day13;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        INoReturnNoParam in1 = () -> System.out.println("888");
        in1.test();

        INoReturnOneParam in2 = a -> System.out.println(a);
        in2.test(100);

        INoReturnTwoParam in3 = (a, b) -> System.out.println(a + b);
        in3.test(1, 3);

        IHasReturnNoParam in4 = () -> 1;
        System.out.println(in4.test());

        IHasReturnOneParam in5 = a -> a + 1;
        System.out.println(in5.method(200));

        IHasReturnTwoParam in6 = (a, b) -> a + b;
        System.out.println(in6.test(1000, 1000));

    }
}

//无返回值无参数的功能接口
@FunctionalInterface
interface INoReturnNoParam {
    void test();
}

//无返回值有一个参数的功能接口
@FunctionalInterface
interface INoReturnOneParam {
    void test(int a);
}

//无返回值两个参数的功能接口
@FunctionalInterface
interface INoReturnTwoParam {
    void test(int a, int b);
}

//有返回值无参数的功能接口
@FunctionalInterface
interface IHasReturnNoParam {
    int test();
}

//有返回值一个参数的功能接口
@FunctionalInterface
interface IHasReturnOneParam {
    int method(int a);
}

//有返回值两个参数的功能接口
@FunctionalInterface
interface IHasReturnTwoParam {
    int test(int a, int b);
}