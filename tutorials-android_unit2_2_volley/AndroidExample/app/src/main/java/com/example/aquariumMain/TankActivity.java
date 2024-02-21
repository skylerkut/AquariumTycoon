package com.example.aquariumMain;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidexample.R;

public class TankActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintank);

        ImageView tankImage = findViewById(R.id.tankImage);

        //Get this tank
        Bundle bundle = getIntent().getExtras();
        int extras = bundle.getInt("TankID");
        Log.i("TankID", "TankID: " + extras);

        //Load this tank from inventory
        AquariumInventory Inventory = AquariumInventory.getInstance();
        Tank thisTank = Inventory.tankInv.get(extras-1);
        tankImage.setImageResource(thisTank.getBackgroundImage());
    }

    @Override
    public void onClick(View view) {

    }
}
