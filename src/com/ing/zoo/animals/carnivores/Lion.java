package com.ing.zoo.animals.carnivores;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.contracts.Carnivore;

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
