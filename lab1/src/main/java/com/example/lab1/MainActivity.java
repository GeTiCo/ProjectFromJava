package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        try {
            EditText first = findViewById(R.id.editTextTextPersonName);
            EditText second = findViewById(R.id.editTextTextPersonName2);
            TextView result = findViewById(R.id.resulterss);

            String f = first.getText().toString();
            double a = Double.parseDouble(f);

            String s = second.getText().toString();
            double b = Double.parseDouble(s);

            double r = a + b;

            result.setText("Результат сложения: " + new DecimalFormat("0.00").format(r));

        }catch (NumberFormatException e){
            TextView result = findViewById(R.id.resulterss);
            result.setText("");
            Toast.makeText(this, "Введите данные",
                    Toast.LENGTH_SHORT).show();
        }
    }

}