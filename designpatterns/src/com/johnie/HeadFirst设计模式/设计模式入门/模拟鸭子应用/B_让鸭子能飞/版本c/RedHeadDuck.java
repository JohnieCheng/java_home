package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.B_让鸭子能飞.版本c;

/**
 * MallardDuck
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/8 23:15
 */
public class RedHeadDuck extends Duck {
    @Override
    void display() {
        System.out.println("duck`s head is red");
    }

    @Override
    void fly() {
        System.out.println("RedHeadDuck is flying！");
    }
}
