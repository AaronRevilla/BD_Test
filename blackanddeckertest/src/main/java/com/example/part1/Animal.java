package com.example.part1;

/**
 * Created by Aaron Revilla on 11/21/2016.
 */

public abstract class Animal extends Jungle {

    public int numberOfAnimals =0;
    public int energyLevel = 0;
    public String sound;

    public Animal(String sound, int energyLevel){
        this.sound = sound;
        this.energyLevel = energyLevel;
        numberOfAnimals++;
    }

    public void makeSound(){
        System.out.println(sound);
        energyLevel -= 3;
    }
    public void eatFood(){
        energyLevel += 5;
    }
    public void eatFood(Food food){
        eatFood();
    }
    public void sleep(){
        energyLevel += 10;
    }

    public void reportEnergyLevel(){
        System.out.println(energyLevel);
    }

    public void soundOff(){
        System.out.println(sound + " " + energyLevel);
    }
}
