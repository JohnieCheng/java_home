package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.D_针对接口编程.版本e;

/**
 * FlyWithWings
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/9 00:09
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("duck fly with wings!");
    }
}
