package com.ing.zoo.animals.herbivores;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.contracts.Herbivore;

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
