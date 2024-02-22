package com.example.aquariumMain;

public class Creature {

    int hunger;

    public Creature(double size, double happiness, String loves, String name, int image, boolean isLocked, String location) {
        this.size = size;
        this.happiness = happiness;
        this.loves = loves;
        this.name = name;
        this.image = image;
        this.isLocked = isLocked;
        this.location = location;
    }

    double size;
    double happiness;
    String loves;
    String name;
    int image;
    boolean isLocked = true;
    String location;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public String getLoves() {
        return loves;
    }

    public void setLoves(String loves) {
        this.loves = loves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
