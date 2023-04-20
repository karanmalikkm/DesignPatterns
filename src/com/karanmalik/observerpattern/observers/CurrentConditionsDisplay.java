package com.karanmalik.observerpattern.observers;

import com.karanmalik.observerpattern.subject.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private float temp;
    private float humidity;
    private float pressure;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: \nTemperature=" + temp + "F \nHumidity: "+humidity+"%\nPressure: "+pressure+" bars");
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
