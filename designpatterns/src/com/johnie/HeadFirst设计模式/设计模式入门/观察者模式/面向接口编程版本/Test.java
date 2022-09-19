package com.johnie.HeadFirst设计模式.设计模式入门.观察者模式.面向接口编程版本;

/**
 * Test
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/12 22:43
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(12, 12, 12);
        //
    }
}
