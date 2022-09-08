package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.B_让鸭子能飞.版本c;

/**
 * Duck
 *
 * @author johniecheng
 * @version 1.0
 * @description 鸭子超类
 * @date 2022/9/8 23:09
 */
public abstract class Duck {
    public void quack(){
        System.out.println("duck is quacking!");
    };

    public void swim(){
        System.out.println("duck is swimming!");
    };

    // 其他方法

    abstract void display();
    abstract void fly();
}
