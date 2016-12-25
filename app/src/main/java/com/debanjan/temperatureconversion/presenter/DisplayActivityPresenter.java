package com.debanjan.temperatureconversion.presenter;

import com.debanjan.temperatureconversion.utility.TemperatureConverter;

/**
 * Created by debanjan on 24/12/16.
 */

public class DisplayActivityPresenter {
    /*
    * The IDisplayActivity implementation, which is to be passed in the constructor
     */
    private IDisplayActivity activity;

    public DisplayActivityPresenter(IDisplayActivity activity) {
        this.activity = activity;
    }

    /*
         * This method is called whenever the fahrenheit text changes
         * param- temperature
         */
    public void onFahrenheitChanged(CharSequence temperature){
        if(temperature.length() == 0) {
            activity.changeCelsiusValue(null);
            return;
        }

        /*
         *Here we have to change the celsius value in view, so we feel like having a methos
         * in the interface, we write a method changeCelsiusValue()
 in IDisplYActivity and use it.
         */
        try {
            float celcius = (TemperatureConverter.convertTemperatureToCelsius(Float.valueOf(temperature.toString())));
            activity.changeCelsiusValue(String.valueOf(celcius));
        } catch (Exception e){
            e.printStackTrace();
            activity.changeCelsiusValue(null);
        }
    }
    /*
     * This method is called whenever the celsius text changes
     * param- temperature
     */
    public void onCelsiusChanged(CharSequence  temperature){
        if(temperature.length() == 0) {
            activity.changeFahrenheitValue(null);
            return;
        }
        /*
         *Here we have to change the fahrenheit value in view, so we feel like having a method
         * in the interface, we write a method changeFahrenheitValue()
 in IDisplYActivity and use it.
         */
        try {
            float fahrenheit = TemperatureConverter.convertTemperatureToFahrenheit(Float.valueOf(temperature.toString()));
            activity.changeFahrenheitValue(String.valueOf(fahrenheit));
        } catch (Exception e){
            e.printStackTrace();
            activity.changeFahrenheitValue(null);
        }
    }

    /*
    *we create an interface to abstract its implementation from the activity
     */
    public interface IDisplayActivity{
        void changeCelsiusValue(String celsius);
        void changeFahrenheitValue(String fahrenheit);
    }
}
