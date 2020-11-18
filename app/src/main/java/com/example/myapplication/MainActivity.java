package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertIt (View view){
        Log.i("Info","Hi ");
        EditText editText = (EditText) findViewById(R.id.editTextAmount);
        String amountInRupees = editText.getText().toString();
        double amountInRupeesDouble = Double.parseDouble(amountInRupees);
        double amountInDollarsDouble = 74.49*amountInRupeesDouble;
        String amountInDollarsString = String.format("%.2f",amountInDollarsDouble);
        Toast.makeText(this, "Amount In Rupees is " + amountInDollarsString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}