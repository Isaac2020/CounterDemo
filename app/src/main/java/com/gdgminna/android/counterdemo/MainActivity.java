package com.gdgminna.android.counterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int score) {
        TextView countView = findViewById(R.id.count);
        countView.setText(String.valueOf(score));
    }

    public void add(View view) {
        counter = counter + 1;
        display(counter);
    }

    public void sub(View view) {
        counter = counter - 1;
        display(counter);
    }

    public void resetCounter(View view) {
        counter = 0;
        display(counter);

    }
}
