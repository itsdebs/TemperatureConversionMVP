package com.debanjan.temperatureconversion.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.debanjan.temperatureconversion.R;
import com.debanjan.temperatureconversion.databinding.ActivityDisplayBinding;
import com.debanjan.temperatureconversion.presenter.DisplayActivityPresenter;

/*
 * after writing the presenter we implement the specific interface here and pass it to the presenter
 */
public class DisplayActivity extends AppCompatActivity implements DisplayActivityPresenter.IDisplayActivity{

    private ActivityDisplayBinding displayBinding;
    private DisplayActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //we create the data binding
        displayBinding = DataBindingUtil.setContentView(this,R.layout.activity_display);
        //we create a presenter object
        presenter = new DisplayActivityPresenter(this);
        //We send this presenter object to the layout
        displayBinding.setPresenter(presenter);


    }
//since business logic is already implemented, we just have to think of implementing the view logic.
    // for that we will just override the following functions with appropiate bodies.
    @Override
    public void changeCelsiusValue(String celsius) {
        displayBinding.setPresenter(null);
        displayBinding.celsiusEditTxt.setText(celsius);
        displayBinding.setPresenter(presenter);
    }

    @Override
    public void changeFahrenheitValue(String fahrenheit) {
        displayBinding.setPresenter(null);
        displayBinding.fahrenheitEditTxt.setText(fahrenheit);
        displayBinding.setPresenter(presenter);
    }
}
