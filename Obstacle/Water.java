package ru.geekbrains.lesson1_J2.Obstacle;

import ru.geekbrains.lesson1_J2.animals.Animal;

public class Water extends Obstacle{

    public Water(int size) {
        super(size);
    }

    @Override
    public void doIt(Animal animal) {
        if(size < animal.getPower()) {
            System.out.println(animal.getName() + " Преодолел препятсвие");
        }else {
            System.out.println(animal.getName() + " Не преодолел препятствие");
        }
    }
}
