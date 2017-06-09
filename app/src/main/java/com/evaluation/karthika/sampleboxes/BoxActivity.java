package com.evaluation.karthika.sampleboxes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class BoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GridLayout grid;
        int count;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.TAG);
        count = Integer.parseInt(message);
        this.setTitle("Cigna - " + message);
        setContentView(R.layout.box_layout);
        grid = (GridLayout) findViewById(R.id.grid);
        for (int i = 0; i < count; i++) {
            View v = new View(this);
            v.setBackgroundResource(R.drawable.box);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.height=200;
            params.width=200;
            params.setMargins(20, 20, 20, 20);
            v.setLayoutParams(params);
            grid.addView(v);

        }
    }
}
