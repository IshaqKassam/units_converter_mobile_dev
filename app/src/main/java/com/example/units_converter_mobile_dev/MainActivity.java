package com.example.units_converter_mobile_dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome;
    Button wattsToHorsepower,ampsTowatts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = findViewById(R.id.welcome);
        wattsToHorsepower = findViewById(R.id.wattsToHorsepower);
        ampsTowatts = findViewById(R.id.ampsToWatts);


        wattsToHorsepower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, WattsToHorsepower.class);
                startActivity(i);
            }
        });

        ampsTowatts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AmpsToWatts.class);
                startActivity(i);
            }
        });
    }
}