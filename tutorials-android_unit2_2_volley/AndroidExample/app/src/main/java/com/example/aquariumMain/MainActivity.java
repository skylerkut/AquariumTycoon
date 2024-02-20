package com.example.aquariumMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.androidexample.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton tank1, tank2, tank3, tank4, tank5, tank6, tank7, customerLine ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tank1 = findViewById(R.id.imageButton1);
        tank2 = findViewById(R.id.imageButton2);
        tank3 = findViewById(R.id.imageButton3);
        tank4 = findViewById(R.id.imageButton4);
        tank5 = findViewById(R.id.imageButton5);
        tank6 = findViewById(R.id.imageButton6);
        tank7 = findViewById(R.id.imageButton7);
        customerLine = findViewById(R.id.customerLineImageButton);

        /* button click listeners */
        tank1.setOnClickListener(this);
        tank2.setOnClickListener(this);
        tank3.setOnClickListener(this);
        tank4.setOnClickListener(this);
        tank5.setOnClickListener(this);
        tank6.setOnClickListener(this);
        tank7.setOnClickListener(this);
        customerLine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i = new Intent(MainActivity.this, TankActivity.class);
        if (id == R.id.imageButton1 || id == R.id.imageButton2 || id == R.id.imageButton3 || id == R.id.imageButton4 || id == R.id.imageButton5 || id == R.id.imageButton5 || id == R.id.imageButton7) {
            /* Start Tank Activity*/
            i.putExtra("TankID", id);
            startActivity(i);
        } else if (id == R.id.customerLineImageButton) {
            /*Start Customer Activity*/
            //startActivity(new Intent(MainActivity.this, JsonObjReqActivity.class));
        }
    }
}