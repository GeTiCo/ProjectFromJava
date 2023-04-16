package com.example.lab5hh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    Button show;
    Button close;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.button);
        dialog = new Dialog(MainActivity.this);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }

        });
    }
    private void showDialog(){
        dialog.setContentView(R.layout.dialogfile);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);

        Button close = dialog.findViewById(R.id.button2);
        TextView resultss;
        results();
        resultss = dialog.findViewById(R.id.textView2);
        resultss.setText(results());

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        dialog.show();

    }
    public String results(){
        String result = "";
        double itog = 0;
        double rr = 0;

        int value1;
        int value2;
        int value3;
        int value4;


        CheckBox klub = findViewById(R.id.checkBox);
        CheckBox malin = findViewById(R.id.checkBox2);
        CheckBox chernik = findViewById(R.id.checkBox3);
        CheckBox onlip = findViewById(R.id.checkBox4);

        EditText etklub = findViewById(R.id.editTextTextPersonName);
        try{
            value1 = Integer.parseInt(etklub.getText().toString());
        }catch (Exception e){
            value1 = 0;
        }
        EditText etmalin = findViewById(R.id.editTextTextPersonName2);
        try{
            value2 = Integer.parseInt(etmalin.getText().toString());
        }catch (Exception e){
            value2 = 0;
        }
        EditText etchernik = findViewById(R.id.editTextTextPersonName3);
        try{
            value3 = Integer.parseInt(etchernik.getText().toString());
        }catch (Exception e){
            value3 = 0;
        }
        EditText etonlip = findViewById(R.id.editTextTextPersonName4);
        try{
            value4 = Integer.parseInt(etonlip.getText().toString());
        }catch (Exception e){
            value4 = 0;
        }

        if(klub.isChecked()){
            rr += (2.1 * value1);
            itog += rr;
            result += "Клубника 2.1 * " + value1 + " = " + rr + "\n";
            rr = 0;
        }
        if(malin.isChecked()){
            rr += (1.7 * value2);
            itog += rr;
            result += "Малина 1.7 * " + value2 + " = " + rr + "\n";
            rr = 0;
        }
        if(chernik.isChecked()){
            rr += (1.3 * value3);
            itog += rr;
            result += "Черника 2.1 * " + value3 + " = " + rr + "\n";
            rr = 0;
        }
        if(onlip.isChecked()){
            rr += (0.7 * value4);
            itog += rr;
            result += "Облипиха 2.1 * " + value4 + " = " + rr + "\n";
            rr = 0;
        }
        result += "Итог: " + itog;

        return result;
    }
}