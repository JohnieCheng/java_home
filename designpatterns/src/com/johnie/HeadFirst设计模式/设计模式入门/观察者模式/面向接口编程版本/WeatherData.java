package com.johnie.HeadFirst设计模式.设计模式入门.观察者模式.面向接口编程版本;

import java.util.ArrayList;

/**
 * WeatherData
 *
 * @author johniecheng
 * @version 1.0
 * @description
 * @date 2022/9/12 22:23
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    private boolean changed;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index != -1) {
            this.observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (Observer observer : this.observers) {
                observer.update(this, null);
            }
            changed = false;
        }

    }

    void measurementsChanged() {
        this.setChanged(true);
        this.notifyObservers();
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    float getTemperature() {
        return 3.3f;
    }

    float getHumidity() {
        return 3.3f;
    }

    float getPressure() {
        return 3.3f;
    }


    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }
}
