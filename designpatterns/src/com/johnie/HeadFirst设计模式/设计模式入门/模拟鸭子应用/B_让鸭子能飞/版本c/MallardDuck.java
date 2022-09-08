package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.B_让鸭子能飞.版本c;

/**
 * MallardDuck
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/8 23:15
 */
public class MallardDuck extends Duck {
    @Override
    void display() {
        System.out.println("MallardDuck`s head is green！");
    }

    @Override
    void fly() {
        System.out.println("MallardDuck is flying！");
    }
}
