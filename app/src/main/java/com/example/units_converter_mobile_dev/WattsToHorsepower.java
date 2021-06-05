package com.example.units_converter_mobile_dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class WattsToHorsepower extends AppCompatActivity {

    EditText watts;
    TextView horsepower;
    Button btnvolt, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watts_to_horsepower);

        horsepower = findViewById(R.id.horsepower);
        watts = findViewById(R.id.watts);
        btnvolt = findViewById(R.id.btn_volt);
        back = findViewById(R.id.back_btn);
        btnvolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wattstring = watts.getText().toString();
                int Swatts = Integer.parseInt(wattstring);
                float convertionValue = 745.7f;
                float result = (Swatts) / (convertionValue);

                if (TextUtils.isEmpty(wattstring))
                //if (Swatts == Integer.parseInt(null))
                {
                    Toast.makeText(WattsToHorsepower.this, "enter an amount", LENGTH_LONG)
                            .show(); }
                else {horsepower.setText(Float.toString(result) + "  Horsepower");}
            }});

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WattsToHorsepower.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}