package com.evaluation.karthika.sampleboxes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;

public class BoxActivity extends AppCompatActivity {
    GridLayout grid;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.PUT_EXTRA);
        count = Integer.parseInt(message);
        this.setTitle("Cigna - " + message);
        setContentView(R.layout.box_layout);
        grid = (GridLayout) findViewById(R.id.grid);
        for (int i = 0; i < count; i++) {


            LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.viewlayout, null);
            grid.addView(view);

        }
    }
}
