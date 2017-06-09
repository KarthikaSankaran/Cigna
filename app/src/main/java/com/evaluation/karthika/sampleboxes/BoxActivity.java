package com.evaluation.karthika.sampleboxes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class BoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LinearLayout linear;
        int count;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra("BOX NUMBER");
        count = Integer.parseInt(message);
        this.setTitle("Cigna - " + message);
        setContentView(R.layout.box_layout);
        linear = (LinearLayout) findViewById(R.id.linear);
        for (int i = 0; i < count; i++) {
            View v = new View(this);
            v.setBackgroundResource(R.drawable.box);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(200, 200);
            params.setMargins(20, 20, 20, 20);
            v.setLayoutParams(params);
            linear.addView(v);

        }
    }
}
