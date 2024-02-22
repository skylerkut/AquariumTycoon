package com.example.aquariumMain;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidexample.R;

import java.util.ArrayList;

public class TankActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintank);

        ImageView tankImage = findViewById(R.id.tankImage);
        TextView tankName = findViewById(R.id.tankNametxt);
        TextView waterDisplay, tempDisplay, sizeDisplay, creatureDisplay, happinessDisplay, incomeDisplay;

        waterDisplay = findViewById(R.id.waterDisplay);
        tempDisplay = findViewById(R.id.tempDisplay);
        sizeDisplay = findViewById(R.id.sizeDisplay);
        creatureDisplay = findViewById(R.id.creatureDisplay);
        happinessDisplay = findViewById(R.id.happinessDisplay);
        incomeDisplay = findViewById(R.id.incomeDisplay);

        //Get this tank
        Bundle bundle = getIntent().getExtras();
        int extras = bundle.getInt("TankID");
        Log.i("TankID", "TankID: " + extras);

        //Load this tank from inventory
        AquariumInventory Inventory = AquariumInventory.getInstance();
        Tank thisTank = Inventory.tankInv.get(extras-1);

        //Set text
        //tankImage.setImageResource(thisTank.getBackgroundImage());
        tankName.setText(thisTank.getTankName());

        boolean isSalt = thisTank.isSaltWater();
        if (isSalt == true){
            waterDisplay.setText("Salt Water");
        }else {
            waterDisplay.setText("Fresh Water");
        }

        double temp = thisTank.getTemp();
        tempDisplay.setText(temp + " Degrees");

        double size = thisTank.getSize();
        sizeDisplay.setText(size + "inches");

        ArrayList<Creature> tankCreatures = new ArrayList<Creature>();
        tankCreatures = thisTank.getCreatures();

        String creatures = "";
        double happinessAvg = 0;

        for (Creature c: tankCreatures) {
            creatures += c.getName() + "--\t";
           happinessAvg += c.getHappiness();
        }
        creatureDisplay.setText("Creatures: " + creatures);

        happinessAvg = happinessAvg/tankCreatures.size();
        happinessAvg = Math.round(happinessAvg * 100.0) / 100.0;
        thisTank.setHappiness(happinessAvg);
        happinessDisplay.setText("Happiness: %" + happinessAvg);


        //TODO:
        //functions:add up happiness, save to this.tank happiness, display
        // income function: for now, multiply fish length by happiness,
        // then average, then +1 coin for each point?

    }

    @Override
    public void onClick(View view) {

    }
}
