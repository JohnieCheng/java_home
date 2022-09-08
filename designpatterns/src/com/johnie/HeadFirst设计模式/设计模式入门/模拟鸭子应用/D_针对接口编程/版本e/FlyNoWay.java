package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.D_针对接口编程.版本e;

/**
 * FlyNoWay
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/9 00:10
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("duck can not fly!");
    }
}
