package com.debanjan.temperatureconversion.model;

/**
 * Created by debanjan on 25/12/16.
 */
/*
 * we create a simple model class for holding the temperature
 */
public class Temperature {

    private float celsius;

    private float fahrenheit;

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }

    public float getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
