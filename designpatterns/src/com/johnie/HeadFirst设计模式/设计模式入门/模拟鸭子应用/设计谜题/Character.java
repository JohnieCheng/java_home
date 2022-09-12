package com.johnie.HeadFirst设计模式.设计模式入门.模拟鸭子应用.设计谜题;

/**
 * Character
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/11 00:07
 */
public abstract class Character {

    private WeaponBehavior weapon;

    abstract void fight();

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
