package com.ittingzhang.test5;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的空参构造
        //报错的原因：
        //会调用Student的无参构造，已有有参构造，系统不会自动生成无参构造
        //Student s = new Student();

        Student ss = new Student("zhangsan",23);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
    }
}
