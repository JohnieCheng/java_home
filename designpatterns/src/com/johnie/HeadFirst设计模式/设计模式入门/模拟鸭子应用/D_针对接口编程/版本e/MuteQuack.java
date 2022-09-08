package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.D_针对接口编程.版本e;

import com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.C_一些可飞一些可叫.版本d.Quackable;

/**
 * MuteQuack
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/9 00:12
 */
public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("duck can not quack");
    }
}
