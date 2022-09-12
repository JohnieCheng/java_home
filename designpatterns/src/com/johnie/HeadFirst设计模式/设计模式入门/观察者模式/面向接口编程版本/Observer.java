package com.johnie.HeadFirst设计模式.设计模式入门.观察者模式.面向接口编程版本;

/**
 * Observer
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/12 22:23
 */
public interface Observer {
    void update(Subject subject, Object obj);
}
