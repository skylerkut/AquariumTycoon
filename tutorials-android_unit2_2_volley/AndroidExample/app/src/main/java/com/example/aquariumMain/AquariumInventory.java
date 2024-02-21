package com.example.aquariumMain;

import com.example.androidexample.R;

import java.util.ArrayList;
import java.util.HashMap;

public class AquariumInventory {
    public ArrayList<Tank> tankInv;
    HashMap<String, Object> allObjects;
    private static AquariumInventory single_instance = null;
    private AquariumInventory(){
        /*Initialize Tanks*/
        tankInv= new ArrayList<Tank>();
        Tank tank1 = new Tank(0,0,0,0,"tank1", R.mipmap.fishtankleft_foreground);
        Tank tank2 = new Tank(0,0,0,0,"tank2", R.mipmap.fishtankright_foreground);
        Tank tank3 = new Tank(0,0,0,0,"tank3", 0);
        Tank tank4 = new Tank(0,0,0,0,"tank4", 0);
        Tank tank5 = new Tank(0,0,0,0,"tank5", 0);
        Tank tank6 = new Tank(0,0,0,0,"tank6", 0);
        Tank tank7 = new Tank(0,0,0,0,"tank7", 0);
        tankInv.add(tank1);
        tankInv.add(tank2);
        tankInv.add(tank3);
        tankInv.add(tank4);
        tankInv.add(tank5);
        tankInv.add(tank6);
        tankInv.add(tank7);
        allObjects = new HashMap<>();
        //Creatures
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

}
