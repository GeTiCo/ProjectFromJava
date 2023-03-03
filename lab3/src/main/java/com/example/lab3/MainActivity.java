package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView infoTextView = findViewById(R.id.textView);
        ImageView image = findViewById(R.id.imageView);
        switch (id) {
            case R.id.action_settings:
                image.setImageResource(R.drawable.img_white);
                infoTextView.setText("Вы выбрали пункт Настройки");
                break;
            case R.id.action_cat1:
                image.setImageResource(R.drawable.img_one);
                infoTextView.setText("Вы выбрали пункт Кекс");
                break;
            case R.id.action_cat2:
                image.setImageResource(R.drawable.img_two);
                infoTextView.setText("Вы выбрали пункт Рудольф");
                break;
            case R.id.action_cat3:
                image.setImageResource(R.drawable.img_three);
                infoTextView.setText("Вы выбрали пункт Снежок");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}