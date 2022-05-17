package com.ing.zoo.animals;

public abstract class Animal {
    private final String name;
    private final String helloText;
    private final String eatText;

    public String getName() {
        return name;
    }

    public String getHelloText() {
        return helloText;
    }

    public String getEatText() {
        return eatText;
    }

    public Animal(String name, String helloText, String eatText) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

}
