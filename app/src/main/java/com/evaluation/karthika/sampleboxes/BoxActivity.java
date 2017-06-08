package com.evaluation.karthika.sampleboxes;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class BoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        LinearLayout linear;
        int count;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra("BOX NUMBER");
        count=Integer.parseInt(message);
        this.setTitle("Cigna - " + message);
        LinearLayout picLL = new LinearLayout(this);
        picLL.layout(0, 0, 100, 100);
        picLL.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
        picLL.setOrientation(LinearLayout.HORIZONTAL);
        //for(int i=0;i<count;i++){
        View v=new View(this);
        v.setBackgroundResource(R.drawable.box);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(300,300);
        v.setLayoutParams(params);
        setContentView(picLL);




        //}

        //setContentView(new CustomView(this,Integer.parseInt(message)));
    }
}
