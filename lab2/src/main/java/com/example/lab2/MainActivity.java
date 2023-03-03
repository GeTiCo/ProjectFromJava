package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})


    public void clear(View view){
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        TextView res = findViewById(R.id.result);

        res.setText("Ваш выбор: ");
    }

    public void start(View view){
        TextView res = findViewById(R.id.result);

        RadioButton Cir = findViewById(R.id.radioCir);
        boolean checked1 = Cir.isChecked();

        RadioButton Squ = findViewById(R.id.radioSqu);
        boolean checked2 = Squ.isChecked();

        RadioButton Rec = findViewById(R.id.radioRec);
        boolean checked3 = Rec.isChecked();


        if(checked1 == true){
            res.setText("Ваш выбор: Circle");
        }
        if(checked2 == true){
            res.setText("Ваш выбор: Square");
        }
        if(checked3 == true){
            res.setText("Ваш выбор: Rectangle");
        }
    }
}