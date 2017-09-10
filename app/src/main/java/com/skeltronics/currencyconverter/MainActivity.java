package com.skeltronics.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double dollarToEuroRate = 0.91;

    public void convertCurrency(View view) {
        Log.i("Convert", "Start Converting");
        Toast convertedValueToast;
        EditText enterDollarNumberView = (EditText) findViewById(R.id.enterDollarNumber);
        String dollarValueString = enterDollarNumberView.getText().toString();
        double dollarValue = Double.parseDouble(dollarValueString);
        Log.i("Convert", "Dollar value is " + String.valueOf(dollarValue));
        double euroValue = dollarValue * dollarToEuroRate;
        String euroValueString = String.valueOf(euroValue);
        Log.i("Convert", "Euro value is " + String.valueOf(euroValue));
        Toast.makeText(MainActivity.this, euroValueString + " Euro", Toast.LENGTH_LONG).show();
        Log.i("Convert", "Completed Conversion");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
