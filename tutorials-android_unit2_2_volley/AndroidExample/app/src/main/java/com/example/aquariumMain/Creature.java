package com.example.aquariumMain;

import java.sql.Array;

public class Creature {

    int hunger;

    public Creature(int hunger, int size, int happiness, String loves, String hates, String eats, String name, int image, boolean isLocked, String type) {
        this.hunger = hunger;
        this.size = size;
        this.happiness = happiness;
        this.loves = loves;
        this.hates = hates;
        this.eats = eats;
        this.name = name;
        this.image = image;
        this.isLocked = isLocked;
        this.type = type;
    }

    int size;
    int happiness;
    String loves;
    String hates;
    String eats;
    String name;
    int image;
    boolean isLocked = true;
    String type;
}
