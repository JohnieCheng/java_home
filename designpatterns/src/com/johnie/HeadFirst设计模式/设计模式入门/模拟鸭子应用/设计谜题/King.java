package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.设计谜题;

/**
 * Queen
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/11 00:15
 */
public class King extends Character{
    @Override
    void fight() {
        setWeapon(new BowAndArrowBehavior());
    }
}
