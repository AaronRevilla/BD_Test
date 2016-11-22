package com.example.part1;

/**
 * Created by Aaron Revilla on 11/21/2016.
 */

public class Tiger extends Animal {

    public Tiger(int energyLevel){
        super("Grrrrrrrr", energyLevel);
    }

    @Override
    public void sleep() {
        energyLevel +=5;
    }

    @Override
    public void eatFood(Food food) {
        if(food != Food.grain){
            this.eatFood();
        }
    }

}
