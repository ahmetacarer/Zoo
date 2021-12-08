package com.ing.zoo.animals;

import com.ing.zoo.types.Animal;
import com.ing.zoo.types.Carnivore;
import com.ing.zoo.types.Peformance;

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
