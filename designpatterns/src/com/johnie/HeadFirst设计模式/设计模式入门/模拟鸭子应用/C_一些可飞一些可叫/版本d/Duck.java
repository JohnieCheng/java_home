package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.C_一些可飞一些可叫.版本d;

/**
 * Duck
 *
 * @author johniecheng
 * @version 1.0
 * @description 鸭子超类
 * @date 2022/9/8 23:09
 */
public abstract class Duck {
    public void swim(){
        System.out.println("duck is swimming!");
    };

    // 其他方法

    abstract void display();
}
