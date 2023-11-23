package com.ittingzhang.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend();

        gf1.setName("庞超");
        gf1.setAge(19);
        gf1.setHeight(175);
        gf1.setWeight(70);

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getHeight());
        System.out.println(gf1.getWeight());

        gf1.CallMe();
        gf1.Kiss();
    }
}
