package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.D_针对接口编程.版本e;

/**
 * Quack
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/9 00:11
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("duck can quack!");
    }
}
