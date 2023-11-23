package com.ittingzhang.test2;

public class GirlFriend {
    private String name;
    private int age;
    private int height;
    private int weight;

    //针对于每一个私有化的成员变量，都提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量name赋值
    public void setName(String name) {
        this.name = name;
    }

    //作用：对外提供name属性，不需要接收数据，不用小括号内的形参
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void CallMe() {
        System.out.println("女朋友在和我打电话");
    }

    public void Play() {
        System.out.println("女朋友在和我玩");
    }

    public void Kiss() {
        System.out.println("女朋友在和我接吻");
    }
}
