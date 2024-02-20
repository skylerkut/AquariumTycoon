package com.example.aquariumMain;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidexample.R;

public class TankActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        String extras = bundle.getString("TankID");

        //Tank.getID.getBackgroundImage.setBackgroundImage()


    }

    @Override
    public void onClick(View view) {

    }
}
