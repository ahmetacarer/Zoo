package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivore;

import java.util.Random;

public class Zebra extends Animal implements Herbivore {
    public Zebra(String name, String helloText,  String eatText)
    {
        super(name,helloText,eatText);
    }

    public Zebra(String name)
    {
        super(name,"zebra zebra", "munch munch zank yee bra");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(getEatText());
    }
}
