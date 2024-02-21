package com.example.aquariumMain;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.androidexample.R;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(MainActivity.this, TankActivity.class);
        startActivity(intent);
    }
}
