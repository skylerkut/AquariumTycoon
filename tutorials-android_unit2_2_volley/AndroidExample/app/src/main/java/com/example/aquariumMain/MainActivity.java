package com.example.aquariumMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.androidexample.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton tank1Button, tank2Button, tank3Button, tank4Button, tank5Button, tank6Button, tank7Button, customerLineButton ;
private Button map,home,book;
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

        /*Bar Buttons*/
        map = findViewById(R.id.MapButton);
        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TankActivity.class);
                    startActivity(intent);
            }});
        home = findViewById(R.id.HomeButton);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TankActivity.class);
                startActivity(intent);
            }});
        book = findViewById(R.id.BookButton);
        book.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TankActivity.class);
                startActivity(intent);
            }});

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(MainActivity.this, TankActivity.class);
        if (id == R.id.imageButton1){
            intent.putExtra("TankID", 1);
            startActivity(intent);
        } else if (id == R.id.customerLineImageButton) {

        }else if (id == R.id.imageButton2) {
            intent.putExtra("TankID", 2);
            startActivity(intent);
        }
        else if (id == R.id.imageButton3) {
            intent.putExtra("TankID", 3);
            startActivity(intent);
        }
        else if (id == R.id.imageButton4) {
            intent.putExtra("TankID", 4);
            startActivity(intent);
        }
        else if (id == R.id.imageButton5) {
            intent.putExtra("TankID", 5);
            startActivity(intent);
        }
        else if (id == R.id.imageButton6) {
            intent.putExtra("TankID", 6);
            startActivity(intent);
        }
        else if (id == R.id.imageButton7) {
            intent.putExtra("TankID", 7);
            startActivity(intent);
        }
    }
}