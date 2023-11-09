package com.wangdao.day10;

import javafx.scene.shape.Shape;

import javax.xml.transform.Source;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        Circle circle = new Circle(5);
        rectangle.countArea();
        rectangle.countRound();
        circle.countArea();
        circle.countRound();
    }
}

abstract class AbstractShape {
    public abstract void countRound();
    public abstract void countArea();
}

class Rectangle extends AbstractShape {
    int length;
    int width;

    @Override
    public void countRound() {
        System.out.println("矩形周长为：" + 2 * (length + width));
    }

    @Override
    public void countArea() {
        System.out.println("矩形面积为：" + length * width);
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Circle extends AbstractShape {
    double radius;


    @Override
    public void countRound() {
        System.out.println("圆的周长为：" + radius * 2 * 3.14);
    }

    @Override
    public void countArea() {
        System.out.println("圆的面积为：" + radius * radius * 3.14);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}