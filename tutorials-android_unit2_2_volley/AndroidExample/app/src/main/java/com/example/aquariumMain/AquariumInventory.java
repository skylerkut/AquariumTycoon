package com.example.aquariumMain;

import com.example.androidexample.R;

import java.util.ArrayList;

public class AquariumInventory {

    private static AquariumInventory single_instance = null;
    private AquariumInventory(){
        /*Initialize Tanks*/
        tankInv= new ArrayList<Tank>();
        Tank tank1 = new Tank(0,0,0,0,"tank1", "@mipmap/fishtankleft_foreground");
        Tank tank2 = new Tank(0,0,0,0,"tank2", "");
        Tank tank3 = new Tank(0,0,0,0,"tank3", "");
        Tank tank4 = new Tank(0,0,0,0,"tank4", "");
        Tank tank5 = new Tank(0,0,0,0,"tank5", "");
        Tank tank6 = new Tank(0,0,0,0,"tank6", "");
        Tank tank7 = new Tank(0,0,0,0,"tank7", "");
        tankInv.add(tank1);
        tankInv.add(tank2);
        tankInv.add(tank3);
        tankInv.add(tank4);
        tankInv.add(tank5);
        tankInv.add(tank6);
        tankInv.add(tank7);
    }
    // Static method to create instance of Singleton class
    public static synchronized AquariumInventory getInstance(){
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new AquariumInventory();
        }
        return single_instance;
    }
    public ArrayList<Tank> getTankInv() {
        return this.tankInv;
    }

    public void setTankInv(ArrayList<Tank> tankInv) {
        this.tankInv = tankInv;
    }

    public ArrayList<Tank> tankInv;
}
