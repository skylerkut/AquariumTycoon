package com.example.aquariumMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.androidexample.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton tank1Button, tank2Button, tank3Button, tank4Button, tank5Button, tank6Button, tank7Button, customerLineButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AquariumInventory Inventory = AquariumInventory.getInstance();

        tank1Button = findViewById(R.id.imageButton1);
        tank2Button = findViewById(R.id.imageButton2);
        tank3Button = findViewById(R.id.imageButton3);
        tank4Button = findViewById(R.id.imageButton4);
        tank5Button = findViewById(R.id.imageButton5);
        tank6Button = findViewById(R.id.imageButton6);
        tank7Button = findViewById(R.id.imageButton7);
        customerLineButton = findViewById(R.id.customerLineImageButton);

        /* button click listeners */
        tank1Button.setOnClickListener(this);
        tank2Button.setOnClickListener(this);
        tank3Button.setOnClickListener(this);
        tank4Button.setOnClickListener(this);
        tank5Button.setOnClickListener(this);
        tank6Button.setOnClickListener(this);
        tank7Button.setOnClickListener(this);
        customerLineButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(MainActivity.this, TankActivity.class);
        intent.putExtra("TankID", id);
        if (id == R.id.imageButton1 || id == R.id.imageButton2 || id == R.id.imageButton3 || id == R.id.imageButton4 || id == R.id.imageButton5 || id == R.id.imageButton5 || id == R.id.imageButton7) {
            /* Start Tank Activity*/
            startActivity(intent);
        } else if (id == R.id.customerLineImageButton) {
            /*Start Customer Activity*/
            //startActivity(new Intent(MainActivity.this, JsonObjReqActivity.class));
        }
    }
}