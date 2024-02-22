package com.example.aquariumMain;

public class Fish extends Creature{

    int hunger;

    public Fish(double size, double happiness, String loves, String name, int image, boolean isLocked, int hunger, String location) {
        super(size, happiness, loves, name, image, isLocked, location);
        this.hunger = hunger;
    }
}
