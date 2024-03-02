package com.example.aquariumMain;

import java.util.ArrayList;

public class Tank {

    public Tank(ArrayList<Creature> creatures, boolean saltWater, double happiness, int income, String tankName, int backgroundImage, double temp, double size) {
        this.creatures = creatures;
        this.saltWater = saltWater;
        this.happiness = happiness;
        this.income = income;
        this.tankName = tankName;
        this.backgroundImage = backgroundImage;
        this.temp = temp;
        this.size = size;
    }
    ArrayList<Creature> creatures;
    public boolean saltWater = false;
    public double happiness;
    public int income;
    public String tankName;
    int backgroundImage;
    public double temp;
    public double size;

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public void setCreatures(ArrayList<Creature> creatures) {
        this.creatures = creatures;
    }

    public boolean isSaltWater() {
        return saltWater;
    }

    public void setSaltWater(boolean saltWater) {
        this.saltWater = saltWater;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getTankName() {
        return tankName;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }

    public int getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(int backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

}
