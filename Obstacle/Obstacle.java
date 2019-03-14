package ru.geekbrains.lesson1_J2.Obstacle;

import ru.geekbrains.lesson1_J2.animals.Animal;

public abstract class Obstacle {
    protected final int size;

    protected Obstacle(int size) {
        this.size = size;
    }

    public abstract void doIt(Animal animal);

}
