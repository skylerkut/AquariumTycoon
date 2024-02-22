package com.example.aquariumMain;

import android.util.Log;

import com.example.androidexample.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AquariumInventory {
    public ArrayList<Tank> tankInv;
    private static AquariumInventory single_instance = null;
    private AquariumInventory(){

        ArrayList<Creature> allCreatures = new ArrayList<Creature>();
        //Coral Fish
        allCreatures.add(new DoctorfishTang(27,"doctorfish1"));
        allCreatures.add(new Clownfish(10,"clownfish1"));
        allCreatures.add(new Parrotfish(30,"parrotfish1"));

        Log.i("Creatures", "AquariumInventory: " + testCreatures);
        /*Initialize Tanks*/
        tankInv= new ArrayList<Tank>();
        Tank tank1 = new Tank(testCreatures,true,0,0,"tank1", R.mipmap.fishtankleft_foreground, 10, 10);
        Tank tank2 = new Tank(null,true,0,0,"tank2", R.mipmap.fishtankright_foreground, 20, 11);
        Tank tank3 = new Tank(null,false,0,0,"tank3", 0, 30, 12);
        Tank tank4 = new Tank(null,true,0,0,"tank4", 0, 40, 13);
        Tank tank5 = new Tank(null,false,0,0,"tank5", 0, 50, 14);
        Tank tank6 = new Tank(null,true,0,0,"tank6", 0, 60, 15);
        Tank tank7 = new Tank(null,false,0,0,"tank7", 0, 70, 16);
        tankInv.add(tank1);
        tankInv.add(tank2);
        tankInv.add(tank3);
        tankInv.add(tank4);
        tankInv.add(tank5);
        tankInv.add(tank6);
        tankInv.add(tank7);
        //Instatiate Objects
        //Coral Reef
//        allObjects.put("Spanish Hogfish", new Creature(0,0,0, null, null, "sea urchin, brittle stars, crustaceans, mollusks ", "Spanish Hogfish", 0, true, "small fish"));
//        allObjects.put("Watercress Algae", new Creature(0,0,0, "coral,rocks,rubble,sea slug", null, "", "Watercress Algae", 0, true, "algae"));
//        allObjects.put("Red Galaxaura", new Creature(0,0,0, "rocks, coral, hard bottoms", null, "", "Red Galaxaura", 0, true, "algae"));
//        allObjects.put("Forkweed", new Creature(0,0,0, "heat", null, "", "Forkweed", 0, true, "algae"));
//        allObjects.put("Sea Grass", new Creature(0,0,0, "shallow sand, mud, turtle", null, "", "Sea Grass", 0, true, "algae"));
//        allObjects.put("Sea Urchin", new Creature(0,0,0, "all", null, "Watercress Algae, Red Galaxaura, Forkweed, Sea Grass", "Sea Urchin", 0, true, "small fish"));
//        allObjects.put("Doctorfish Tang", new Creature(0,0,0, "rocks, coral", null, "Red Galaxaura, Forkweed, Sea Grass", "Doctorfish Tang", 0, true, "medium fish"));

        //Class : smallfish/mid fish/plant/

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
