package com.karanmalik.observerpattern;

import com.karanmalik.observerpattern.observers.CurrentConditionsDisplay;
import com.karanmalik.observerpattern.observers.HeatIndexDisplay;
import com.karanmalik.observerpattern.subject.WeatherData;

public class WeatherStation {
    public static void showWeatherData(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80,64, 30.4f);
    }
}
