package com.company;

public class Main {

    public static void myprint(){
        System.out.println("-----------------懒汉式单例模式----------------");
        System.out.println("第一次取得实例（懒汉式）");
        MySingleton s1 = MySingleton.getInstance();
        System.out.println("第二次取得实例（懒汉式）");
        MySingleton s2 = MySingleton.getInstance();
        if(s1==s2){
            System.out.println(">>>>>s1,s2为同一实例（懒汉式）<<<<<");
        }
        System.out.println();
    }

    public static void myprint2(){
        System.out.println("-----------------饿汉式单例模式----------------");
        System.out.println("第一次取得实例（饿汉式）");
        MySingleton2 s1 = MySingleton2.getInstance();
        System.out.println("第二次取得实例（饿汉式）");
        MySingleton2 s2 = MySingleton2.getInstance();
        if(s1==s2){
            System.out.println(">>>>>s1,s2为同一实例（饿汉式）<<<<<");
        }
        System.out.println();
    }

    public static void myprint4(){
        System.out.println("---------------单例模式实例--------------");
        System.out.println("第一次取得实例");
        MySingleton4 s1 = MySingleton4.getInstance();
        System.out.println(s1.getPuser());
        System.out.println(s1.getPpassword());
        System.out.println("第二次取得实例");
        MySingleton4 s2 = MySingleton4.getInstance();
        System.out.println(s2.getPuser());
        System.out.println(s2.getPpassword());
        if(s1==s2){
            System.out.println(">>>>>s1,s2为同一实例（改进懒汉式）<<<<<");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //懒汉式
        //myprint();
        //饿汉式
        myprint2();
        //配置文件懒汉式
        //myprint4();

    }
}
