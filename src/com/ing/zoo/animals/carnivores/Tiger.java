package com.ing.zoo.animals.carnivores;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.contracts.Carnivore;
import com.ing.zoo.animals.contracts.Peformance;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Peformance {

    public Tiger(String name)
    {
        super(name, "rraaarww", "nomnomnom oink wubalubadubdub");
    }

    public Tiger(String name, String helloText, String eatText)
    {
        super(name,helloText,eatText);
    }

    @Override
    public void eatMeat()
    {
        System.out.println(getEatText());
    }

    public void performTrick()
    {
        Random random = new Random();
        String trick;
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
