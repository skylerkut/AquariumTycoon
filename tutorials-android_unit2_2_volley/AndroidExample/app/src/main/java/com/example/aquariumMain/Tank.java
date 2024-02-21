package com.example.aquariumMain;

public class Tank {
    public Tank(int creatures, int habitat, int happiness, int income, String tankName, int backgroundImage) {
        this.creatures = creatures;
        Habitat = habitat;
        Happiness = happiness;
        this.income = income;
        this.tankName = tankName;
        this.backgroundImage = backgroundImage;
    }

    public int creatures;
    public int Habitat;
    public int Happiness;
    public int income;
    public String tankName;
    int backgroundImage;

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
