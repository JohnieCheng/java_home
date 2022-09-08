package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.C_一些可飞一些可叫.版本d;

/**
 * DecoyDuck
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/8 23:58
 */
public class DecoyDuck extends Duck{
    @Override
    void display() {
        System.out.println("MallardDuck`s head is purple！");
    }
}
