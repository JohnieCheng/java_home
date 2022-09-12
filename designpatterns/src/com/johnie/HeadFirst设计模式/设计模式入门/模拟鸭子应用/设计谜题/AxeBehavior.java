package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.设计谜题;

/**
 * AxeBehavior
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/11 00:13
 */
public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeaponBehavior() {
        System.out.println("使用斧头");
    }
}
