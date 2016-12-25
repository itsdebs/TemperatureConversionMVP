package com.debanjan.temperatureconversion.utility;

/**
 * Created by debanjan on 25/12/16.
 */
/*
 * This is an utility class that helps in converting the temperature
 */
public class TemperatureConverter {

    /*
     *A static method to convert fahrenheit to celsius.
     * param-temperature in fahrenheit
     * returns- temperature in celsius
     */
    public static float convertTemperatureToCelsius(float fahrenheit){
        return (fahrenheit - 32)*5/9;
    }
    /*
     *A static method to convert celsius to fahrenheit.
     * param-temperature in celsius
     * returns- temperature in fahrenheit
     */
    public static float convertTemperatureToFahrenheit(float celsius){
        return (celsius/5 * 9) +32;
    }
}
