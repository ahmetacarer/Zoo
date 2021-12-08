package com.ing.zoo.animals;

import com.ing.zoo.types.Animal;
import com.ing.zoo.types.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public Hippo(String name, String helloText,  String eatText)
    {
        super(name,helloText,eatText);
    }

    public Hippo(String name)
    {
        super(name, "splash", "munch munch lovely");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(getEatText());
    }
}
