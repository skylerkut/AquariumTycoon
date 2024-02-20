package com.example.androidexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

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
        if (id == R.id.imageButton1 || id == R.id.imageButton2 || id == R.id.imageButton3 || id == R.id.imageButton4 || id == R.id.imageButton5 || id == R.id.imageButton5 || id == R.id.imageButton7) {
            /* Start Tank Activity*/
            startActivity(new Intent(MainActivity.this, StringReqActivity.class));
        } else if (id == R.id.customerLineImageButton) {
            /*Start Customer Activity*/
            startActivity(new Intent(MainActivity.this, JsonObjReqActivity.class));
        }
    }
}