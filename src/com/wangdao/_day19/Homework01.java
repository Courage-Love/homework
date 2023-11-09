package com.wangdao._day19;

import java.io.*;
import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        User user = new User(12, "cxw", "13559888", new Address("beijing", "555555"));
        User user2 = new User(13, "zs", "13559888", new Address("shanghai", "555555"));
        User user3 = new User(12, "ls", "13559888", new Address("shenzhen", "555555"));
        User[] users = {user, user2, user3};
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
            objectInputStream = new ObjectInputStream(new FileInputStream("a.txt"));
            objectOutputStream.writeObject(user);
            User user1 = ((User) objectInputStream.readObject());
            System.out.println(user1);
            objectOutputStream.writeObject(users);
            User[] users1 = (User[]) objectInputStream.readObject();
            System.out.println(Arrays.toString(users1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

class User implements Serializable {
    int id;
    String name;
    String mobile;
    Address address;

    public User(int id, String name, String mobile, Address address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address implements Serializable {
    String detail;
    String code;

    public Address(String detail, String code) {
        this.detail = detail;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "detail='" + detail + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}