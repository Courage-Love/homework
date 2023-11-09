package com.wangdao.day19;

import java.io.*;
import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        User user = new User(12, "cxw", "13549633341", new Address("武汉", "23568"));
        User user2 = new User(13, "zs", "13549633341", new Address("北京", "23568"));
        User user3 = new User(15, "ls", "13549633341", new Address("上海", "23568"));
        serializable(user);
        unSerializable();
        User[] users = {user,user2, user3};
        serializable2(users);
        unSerializable2();
    }

    private static void unSerializable2() {
        try (ObjectInputStream bi = new ObjectInputStream(new FileInputStream("a.txt"))){
            User[] users = (User[])bi.readObject();
            System.out.println(Arrays.toString(users));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void serializable2(User[] users) {
        try (ObjectOutputStream bo = new ObjectOutputStream(new FileOutputStream("a.txt"))){
            bo.writeObject(users);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void unSerializable() {
        try (ObjectInputStream bi = new ObjectInputStream(new FileInputStream("a.txt"))){
            Object o = bi.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void serializable(User user) {
        try (ObjectOutputStream bo = new ObjectOutputStream(new FileOutputStream("a.txt"))){
            bo.writeObject(user);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class User implements Serializable {
    private static final long serialVersionUID = -414624143139253341L;
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

class Address implements Serializable{
    private static final long serialVersionUID = 8634330624342458344L;
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

