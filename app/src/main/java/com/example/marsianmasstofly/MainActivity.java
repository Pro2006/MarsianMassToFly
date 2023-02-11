package com.example.marsianmasstofly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtOutOil;
    private EditText massIn;
    private Button btnCount;

    private String mass;

    private Algorithm algorithm = new Algorithm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOutOil = findViewById(R.id.txtOutOil);
        massIn = findViewById(R.id.massIn);
        btnCount = findViewById(R.id.buttonCount);

        btnCount.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v) {
            mass = massIn.getText().toString();
            txtOutOil.setText("Столько потребуетс топлива, чтобы вывести спутник на орбиту Марса"
                    + algorithm.calculateOil(mass));

        }
    };
}