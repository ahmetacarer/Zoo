package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivore;

public class Butterfly extends Animal implements Herbivore {
    public Butterfly(String name, String helloText,  String eatText)
    {
        super(name,helloText,eatText);
    }

    public Butterfly(String name)
    {
        super(name, "woosh", "tasty zzz");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(getEatText());
    }
}
