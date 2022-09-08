package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.C_一些可飞一些可叫.版本d;

/**
 * MallardDuck
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/8 23:15
 */
public class MallardDuck extends Duck implements Flyable,Quackable {
    @Override
    void display() {
        System.out.println("MallardDuck`s head is green！");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck is flying！");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck is quacking！");
    }
}
