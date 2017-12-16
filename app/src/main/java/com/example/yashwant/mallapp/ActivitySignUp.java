package com.example.yashwant.mallapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Spinner;

public class ActivitySignUp extends AppCompatActivity {

    String[] CarType={"Hatch Back","Sedan","Suv"};
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Spinner spin = (Spinner) findViewById(R.id.spinner);

        CustomAdapterSpinner customAdapter=new CustomAdapterSpinner(getApplicationContext(),CarType);
        spin.setAdapter(customAdapter);

    }
}
