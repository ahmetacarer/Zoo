package com.ing.zoo.animals.herbivores;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.contracts.Herbivore;

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
