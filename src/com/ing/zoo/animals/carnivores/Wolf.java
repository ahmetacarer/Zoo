package com.ing.zoo.animals.carnivores;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.contracts.Carnivore;

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
