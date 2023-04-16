package com.example.lab4h;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {
    String[] dlin = { "mm", "cm", "in", "m", "km"};
    String[] mass = { "gr", "kg", "t"};
    int type;
    int selected;
    int selected2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<?> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dlin);
        adapter.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected =  spinner.getSelectedItemPosition();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };

        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<?> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dlin);
        adapter2.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        AdapterView.OnItemSelectedListener itemSelectedListener2 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected2 =  spinner2.getSelectedItemPosition();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
        spinner2.setOnItemSelectedListener(itemSelectedListener2);

        type = 1;
    }
    public void rad1(){
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<?> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dlin);
        adapter.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected =  spinner.getSelectedItemPosition();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };

        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<?> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dlin);
        adapter2.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        AdapterView.OnItemSelectedListener itemSelectedListener2 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected2 =  spinner2.getSelectedItemPosition();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
        spinner2.setOnItemSelectedListener(itemSelectedListener2);
    }
    public void rad2(){
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<?> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, mass);
        adapter.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected =  spinner.getSelectedItemPosition();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };

        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<?> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, mass);
        adapter2.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        AdapterView.OnItemSelectedListener itemSelectedListener2 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selected2 =  spinner2.getSelectedItemPosition();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
        spinner2.setOnItemSelectedListener(itemSelectedListener2);
    }
    public void start(View view){
        RadioButton rad1 = findViewById(R.id.radioButton);
        RadioButton rad2 = findViewById(R.id.radioButton2);

        EditText editValue = findViewById(R.id.editTextTextPersonName);
        EditText editValue2 =  findViewById(R.id.editTextTextPersonName2);

        try{
            if(rad1.isChecked()){

                double value = Double.parseDouble(editValue.getText().toString());
                double result = 0;

                if(selected == 0) {
                    if (selected2 == 0) {
                        result = value;
                    }
                    if (selected2 == 1) {
                        result = value / 10;
                    }
                    if (selected2 == 2) {
                        result = value / 100;
                    }
                    if (selected2 == 3) {
                        result = value / 1000;
                    }
                    if (selected2 == 4) {
                        result = value / 1000000;
                    }
                }
                else if(selected == 1) {
                    if (selected2 == 0) {
                        result = value * 10;
                    }
                    if (selected2 == 1) {
                        result = value;
                    }
                    if (selected2 == 2) {
                        result = value / 10;
                    }
                    if (selected2 == 3) {
                        result = value / 100;
                    }
                    if (selected2 == 4) {
                        result = value / 100000;
                    }
                }
                else if(selected == 2) {
                    if (selected2 == 0) {
                        result = value * 100;
                    }
                    if (selected2 == 1) {
                        result = value * 10;
                    }
                    if (selected2 == 2) {
                        result = value;
                    }
                    if (selected2 == 3) {
                        result = value / 10;
                    }
                    if (selected2 == 4) {
                        result = value / 10000;
                    }
                }
                else if(selected == 3) {
                    if (selected2 == 0) {
                        result = value * 1000;
                    }
                    if (selected2 == 1) {
                        result = value * 100;
                    }
                    if (selected2 == 2) {
                        result = value * 10;
                    }
                    if (selected2 == 3) {
                        result = value;
                    }
                    if (selected2 == 4) {
                        result = value / 1000;
                    }
                }
                else if(selected == 4) {
                    if (selected2 == 0) {
                        result = value * 1000000;
                    }
                    if (selected2 == 1) {
                        result = value * 100000;
                    }
                    if (selected2 == 2) {
                        result = value * 10000;
                    }
                    if (selected2 == 3) {
                        result = value * 1000;
                    }
                    if (selected2 == 4) {
                        result = value;
                    }
                }
                else{
                    editValue2.setText("Неверные данные");
                }
                editValue2.setText(result+"");
            }else{

                double value = Double.parseDouble(editValue.getText().toString());
                double result = 0;

                if(selected == 0) {
                    if (selected2 == 0) {
                        result = value;
                    }
                    if (selected2 == 1) {
                        result = value / 1000;
                    }
                    if (selected2 == 2) {
                        result = value / 1000000;
                    }
                }
                else if(selected == 1) {
                    if (selected2 == 0) {
                        result = value * 1000;
                    }
                    if (selected2 == 1) {
                        result = value;
                    }
                    if (selected2 == 2) {
                        result = value / 1000;
                    }
                }
                else if(selected == 2) {
                    if (selected2 == 0) {
                        result = value * 1000000;
                    }
                    if (selected2 == 1) {
                        result = value * 1000;
                    }
                    if (selected2 == 2) {
                        result = value;
                    }
                }
                else{
                    editValue2.setText("Неверные данные");
                }
                editValue2.setText(result+"");
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Введите данные", Toast.LENGTH_SHORT).show();
        }
        if(rad1.isChecked() && type != 1){
            editValue.setText("");
            editValue2.setText("");
            type = 1;
            rad1();
        }
        if(rad2.isChecked() && type != 2){
            editValue.setText("");
            editValue2.setText("");
            type = 2;
            rad2();
        }

    }
}