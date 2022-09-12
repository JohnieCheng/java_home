package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.设计谜题;

/**
 * SwordBehavior
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/11 00:14
 */
public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeaponBehavior() {
        System.out.println("使用剑");
    }
}
