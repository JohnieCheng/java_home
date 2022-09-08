package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.D_针对接口编程.版本e;


/**
 * Test
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/9 00:22
 */
public class Test {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();

    }
}
