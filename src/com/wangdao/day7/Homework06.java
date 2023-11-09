package com.wangdao.day7;

/**
 * @version 1.0
 * @auther cxw
 */

import java.util.TooManyListenersException;

/**
* 设计一个员工类(Staff)，要求该类：
     属性: 姓名,性别,工号,工资
     构造器:
     姓名的单参构造器、姓名和性别的双参构造器、姓名、性别和工资的三参构造器
其中员工的工号要求(每一位员工都必须有工号):
     第一个员工对象的工号是10001
     第二个员工对象的工号是10002
     第三个员工对象的工号是10003
     ....
现在每位员工都要缴纳一个固定额的公积金（比如2000），要求在员工类中设计一个方法求员工的到手工资。（除了扣除这个固定额度的公积金，不考虑诸如扣税等其余问题）
最后再定义一个方法用于打印员工对象的各种属性取值，其中在打印工资时，要打印实际到手工资。
将该类定义完毕后，尝试创建对象，测试一下代码。
*/
public class Homework06 {
    public static void main(String[] args) {
        Staff staff01 = new Staff("tom", "男", 5000);
        Staff staff02 = new Staff("jack", "男", 6000);
        Staff staff03 = new Staff("smith", "男", 4000);
        System.out.println(staff01.id);
        System.out.println(staff02.id);
        System.out.println(staff03.id);
        System.out.println(staff01.name + "到手工资为" + staff01.getSalary());
        staff01.print();
    }
}

class Staff {
    static int count = 10000;

    String name;
    String gender;
    int id;
    double salary;

    {
        id = ++count;
    }

    public Staff(String name) {
        this.name = name;
    }

    public Staff(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Staff(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public double getSalary() {
        return salary - 2000;
    }

    public void print() {
        System.out.println("Staff{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", salary=" + (salary - 2000) +
                '}');
    }
}
