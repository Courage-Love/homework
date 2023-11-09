package com.wangdao.day10;

import javax.swing.*;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        AbstractPerson abstractPerson = new Student("jack", "male", 10);
        AbstractPerson abstractPerson1 = new Teacher("tom", "female", 20);
        abstractPerson.eat();
        abstractPerson.sleep();
        abstractPerson1.eat();
        abstractPerson1.sleep();
        IAction action = ((Student) abstractPerson);
        action.action();
        ILanguage language = ((Teacher) abstractPerson1);
        language.language();
    }
}

abstract class AbstractPerson {
    String name;
    String gender;
    int age;
    abstract void eat();
    abstract void sleep();

    public AbstractPerson(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

interface IAction {
    void action();
}

interface ILanguage {
    void language();
}

class Student extends AbstractPerson implements IAction{

    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    void eat() {
        System.out.println("学生吃");
    }

    @Override
    void sleep() {
        System.out.println("学生睡");
    }

    @Override
    public void action() {
        System.out.println("学生实践动手");
    }
}

class Teacher extends AbstractPerson implements ILanguage{

    public Teacher(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    void eat() {
        System.out.println("老师吃");
    }

    @Override
    void sleep() {
        System.out.println("老师睡");
    }

    @Override
    public void language() {
        System.out.println("老师学习语言");
    }
}



