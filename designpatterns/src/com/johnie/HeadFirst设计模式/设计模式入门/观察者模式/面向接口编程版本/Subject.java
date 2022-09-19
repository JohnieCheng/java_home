package com.johnie.HeadFirst设计模式.设计模式入门.观察者模式.面向接口编程版本;

/**
 * Subject
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/12 22:21
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
