package com.example.lab5h;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MyDialogFragment extends AppCompatDialogFragment {

}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        try{

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT).show();
        }
    }
    public double plus(){
        double result = 0;

        CheckBox strawb = findViewById(R.id.checkBox);
        CheckBox chery = findViewById(R.id.checkBox3);
        CheckBox malin = findViewById(R.id.checkBox4);
        CheckBox smorod = findViewById(R.id.checkBox5);

        EditText strawbCol = findViewById(R.id.editTextTextPersonName);
        EditText cheryCol = findViewById(R.id.editTextTextPersonName2);
        EditText malinCol = findViewById(R.id.editTextTextPersonName3);
        EditText smorodCol = findViewById(R.id.editTextTextPersonName4);

        if(strawb.isChecked()){
            result += Double.parseDouble(strawbCol.getText().toString()) * 1.7;
        }
        if(chery.isChecked()){
            result += Double.parseDouble(cheryCol.getText().toString()) * 1.7;
        }
        if(malin.isChecked()){
            result += Double.parseDouble(malinCol.getText().toString()) * 1.7;
        }
        if(smorod.isChecked()){
            result += Double.parseDouble(smorodCol.getText().toString()) * 1.7;
        }

        return result;
    }
}

