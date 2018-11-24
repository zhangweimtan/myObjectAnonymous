package com.myjava01;
/*
    匿名对象：
        没有名字的对象
    应用场景
        当方法只调用一次的时候，可以使用匿名对象
        可以当做参数传递，但是无法再传参之前做其他事情，例如赋值

    注意：
        匿名对象可以调用成员变量，并赋值，但是赋值并没有意义
 */
public class AnonymousObjectDemo {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.study();

//        new Student();//匿名对象，没有变量引用的对象
//        new Student().study();
        method(new Student());
    }
    public static void method(Student s){

    }
}

class Student{
    String name;
    int age;
    public void study(){
        System.out.println("好好学习");
    }
}