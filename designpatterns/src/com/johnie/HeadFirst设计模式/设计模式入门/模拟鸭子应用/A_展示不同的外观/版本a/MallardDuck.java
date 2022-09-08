package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.A_展示不同的外观.版本a;

/**
 * MallardDuck
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/8 23:15
 */
public class MallardDuck extends Duck{
    @Override
    void display() {
        System.out.println("duck`s head is green！");
    }
}
