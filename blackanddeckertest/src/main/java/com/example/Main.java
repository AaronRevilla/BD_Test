package com.example;

import com.example.part1.Food;
import com.example.part1.Tiger;

public class Main {

    public static void main(String[] args) {

        Tiger t = new Tiger(10);

        t.eatFood();
        t.soundOff();
        t.makeSound();
        t.soundOff();
        t.sleep();
        t.soundOff();
        t.eatFood(Food.grain);
        t.soundOff();
        t.eatFood(Food.meat);
        t.soundOff();

    }

}
