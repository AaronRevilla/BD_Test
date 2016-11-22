package com.example.part1;

/**
 * Created by User on 11/21/2016.
 */

public class Monkey extends Animal {

    private int energyLevel = 0;
    public Monkey(int energyLevel){
        super("Oooo Oooo Oooo", energyLevel);
    }

    @Override
    public void eatFood() {
        energyLevel +=2;
    }

    @Override
    public void makeSound() {
        energyLevel -=4;
    }

    public void play(){
        if(energyLevel >= 8){
            System.out.println("Oooo Oooo Oooo");
            energyLevel -=8;
        }
        else{
            System.out.println("Monkey is too tired");
        }
    }

}
