package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.D_针对接口编程.版本e;

/**
 * MallarDuck
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/9 00:18
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior= new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I`m a real MallardDuck!");
    }
}
