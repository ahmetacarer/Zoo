package com.ing.zoo.animals.herbivores;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.contracts.Herbivore;

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
