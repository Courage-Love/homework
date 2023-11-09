package com.wangdao.day14;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        print(spring);

    }

    public static void print(Season season){
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            default:
                break;
        }
    }
}

enum Season {
    SPRING("春天", "三月到五月"),
    SUMMER("夏天", "六月到八月"),
    AUTUMN("秋天", "九月到十一月"),
    WINTER("冬天", "十二月到二月");

    String name;
    String time;

    Season(String name, String time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
