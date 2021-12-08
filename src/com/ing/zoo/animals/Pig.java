package com.ing.zoo.animals;

import com.ing.zoo.types.Animal;
import com.ing.zoo.types.Carnivore;
import com.ing.zoo.types.Herbivore;
import com.ing.zoo.types.Peformance;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore, Peformance {

    public Pig(String name)
    {
        super(name, "splash", "munch munch oink");
    }

    public Pig(String name, String helloText, String eatText)
    {
        super(name,helloText,eatText);
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(getEatText());
    }

    @Override
    public void eatMeat()
    {
        System.out.println(getEatText());
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        String trick;
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
