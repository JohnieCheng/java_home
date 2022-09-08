package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.C_一些可飞一些可叫.版本d;

/**
 * RubberDuck
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/8 23:53
 */
public class RubberDuck extends Duck implements Quackable{
    @Override
    void display() {
        System.out.println("RubberDuck`s head is yellow！");

    }

    @Override
    public void quack() {
        System.out.println("RubberDuck can not quack！");
    }
}
