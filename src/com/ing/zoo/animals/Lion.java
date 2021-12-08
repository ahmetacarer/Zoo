package com.ing.zoo.animals;

import com.ing.zoo.types.Animal;
import com.ing.zoo.types.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion(String name, String helloText,  String eatText)
    {
        super(name,helloText,eatText);
    }

    public Lion(String name)
    {
        super(name, "roooaoaaaaar", "nomnomnom thx mate");
    }
    @Override
    public void eatMeat()
    {
        System.out.println(getEatText());
    }
}
