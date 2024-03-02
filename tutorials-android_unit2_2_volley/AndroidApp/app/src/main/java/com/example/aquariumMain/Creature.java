package com.example.aquariumMain;

public class Creature {

    int hunger;

    public Creature(double size, String name) {
        this.size = size;
        this.name = name;
//        //every creatures needs unique happiness
//        this.happiness = happiness;
//        this.loves = loves;

//        this.image = image;
//        this.isLocked = isLocked;
//        this.location = location;
    }

    double size;
    String name;
//    double happiness;
//    String loves;

//    int image;
//    boolean isLocked = true;
//    String location;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
