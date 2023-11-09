import org.junit.jupiter.api.Test;

import java.lang.management.ManagementFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @version 1.0
 * @auther cxw
 */
class MainTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        dog1.age = 1;
        dog1.name = "萨摩耶";
        dog1.color = "白色";
        System.out.println(dog1);
        System.out.println(dog1);
        System.out.println(dog1);
    }

}

class Dog{
    String name;
    int age;
    String color;
    public void bark(){
        System.out.println("我汪我!");
        System.out.println("我汪我!");
        System.out.println("手动阀手动打发士大夫阀十分");
        System.out.println("手动阀手动阀十分");
        System.out.println("手啊沙发沙发动阀十分");
        System.out.println("push沙发动阀十分");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
