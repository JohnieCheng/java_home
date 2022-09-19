package com.johnie.HeadFirst设计模式.设计模式入门.观察者模式.面向接口编程版本;

/**
 * CurrentConditionDisplay
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/12 22:27
 */
public class CurrentConditionDisplay implements Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public void update(Subject subject, Object obj) {
        if (subject instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" + "temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + ", subject=" + subject + '}';
    }
}
