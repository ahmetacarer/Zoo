package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivore;

public class Wolf extends Animal implements Carnivore {

    public Wolf(String name)
    {
        super(name, "awoooohhhh", "awoohhh nomom");
    }

    public Wolf(String name, String helloText, String eatText)
    {
        super(name,helloText,eatText);
    }

    @Override
    public void eatMeat()
    {
        System.out.println(getEatText());
    }
}