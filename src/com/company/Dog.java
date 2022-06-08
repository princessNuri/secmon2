package com.company;

public class Dog extends Animal implements SoundProducable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC36");
    }

    @Override
    public void callSound() {
        System.out.println("Гав гав");
    }
}
