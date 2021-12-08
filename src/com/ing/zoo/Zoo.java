package com.ing.zoo;
import com.ing.zoo.animals.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    private static List<Animal> animals;
    private static final String[] commands = {"hello", "give leaves", "give meat", "perform trick"};

    public static void main(String[] args)
    {
        initializeAnimals();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("stop"))
        {
            System.out.print("> Voer uw command in: ");
            input = scanner.nextLine();
            options(input);
        }
        scanner.close();
        System.exit(1);
    }

    private static void options(String input) {
        if(input.equals(commands[0]))
        {
            animalsGreet();
        }
        else if(input.contains("hello "))
        {
            String nameOfAnimal = input.split("hello ")[1]; //splits between hello and the name of the animal and takes the name
            specificAnimalSaysHello(nameOfAnimal);
        }
        else if(input.equals(commands[1]))
        {
            feedHerbivores();
        }
        else if(input.equals(commands[2]))
        {
            feedCarnivores();
        }
        else if(input.equals(commands[3]))
        {
            animalsPerformTricks();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }

    private static void initializeAnimals() {
        animals = Arrays.asList(new Lion("henk"),
                new Hippo("elsa"), new Pig("dora"),
                new Tiger("wally"), new Zebra("marty"),
                new Butterfly("sting"), new Wolf("Akela"));
    }

    private static void animalsPerformTricks() {
        for (Animal animal:
                animals) {
            if (animal instanceof Peformance)
                ((Peformance) animal).performTrick();
        }
    }

    private static void feedCarnivores() {
        for (Animal animal:
                animals) {
            if (animal instanceof Carnivore)
                ((Carnivore) animal).eatMeat();
        }
    }

    private static void feedHerbivores() {
        for (Animal animal:
             animals) {
            if (animal instanceof Herbivore)
                ((Herbivore) animal).eatLeaves();
        }
    }

    private static void animalsGreet() {
        animals.forEach(Animal::sayHello);
    }

    private static void specificAnimalSaysHello(String name) {
        for (Animal animal:
             animals) {
            if (name.equals(animal.getName()))
            {
                animal.sayHello();
                break; // ensures list stops after the specific animal greets
            }
        }
    }
}
