package com.ing.zoo;
import com.ing.zoo.animals.*;
import com.ing.zoo.types.Animal;
import com.ing.zoo.types.Carnivore;
import com.ing.zoo.types.Herbivore;
import com.ing.zoo.types.Peformance;

import java.util.*;

public class Zoo {

    private static List<Animal> animals;
    private static Map<String, Runnable> commands = new HashMap<>();
    public static void main(String[] args)
    {
        addStandardCommands();
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

    private static void addStandardCommands() {
        commands.put("hello", Zoo::animalsGreet);
        commands.put("give leaves", Zoo::feedHerbivores);
        commands.put("give meat", Zoo::feedCarnivores);
        commands.put("perform trick", Zoo::animalsPerformTricks);
    }

    private static void options(String input) {
        if (commands.containsKey(input)) {
            commands.get(input).run();
        }
        else if (input.contains("hello ") && input.length() > "hello ".length()) {
            specificAnimalGreets(input.split("hello ")[1]);
        }
    }

    private static void initializeAnimals() {
        animals = Arrays.asList(new Lion("henk"),
                new Hippo("elsa"), new Pig("dora"),
                new Tiger("wally"), new Zebra("marty"),
                new Butterfly("sting"), new Wolf("akela"));
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

    private static void specificAnimalGreets(String name) {
        for (Animal animal:
             animals) {
            if (name.equals(animal.getName())) {
                animal.sayHello();
            }
        }
    }
}
