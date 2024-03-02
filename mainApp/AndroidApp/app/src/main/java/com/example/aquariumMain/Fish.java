package com.example.aquariumMain;

import com.example.androidexample.R;

import java.lang.reflect.Array;

public class Fish extends Creature{
    int hunger = 50;
    public Fish(double size, String name) {
        super(size, name);
    }
}

class DoctorfishTang extends Fish{
    public DoctorfishTang(double size, String name) {
        super(size, name);
    }
    final double fishSize[] = {2,39}; //cm
    final int image = R.drawable.doctorfish;
    boolean isLocked = true;
    final String location = "coralreef";

}
class Clownfish extends Fish{
    public Clownfish(double size, String name) {
        super(size, name);
    }
    final double fishSize[] = {2,15}; //cm
    final int image = R.drawable.doctorfish;
    boolean isLocked = true;
    final String location = "coralreef";

}
class Parrotfish extends Fish{
    public Parrotfish(double size, String name) {
        super(size, name);
    }
    final double fishSize[] = {2,38}; //cm
    final int image = R.drawable.parrotfish;
    boolean isLocked = true;
    final String location = "coralreef";

}