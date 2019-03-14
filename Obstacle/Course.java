package ru.geekbrains.lesson1_J2.Obstacle;

import ru.geekbrains.lesson1_J2.Team;
import ru.geekbrains.lesson1_J2.animals.Animal;

public class Course {
    private Obstacle [] obstacles;
    private Animal [] members;

    public Course(Obstacle[] obstacles, Animal[] members){
        this.obstacles = obstacles;
        this.members = members;
    }

    public void doIt(Team team) {
        for (Obstacle o:obstacles){
            for (Animal animal:members){
                o.doIt(animal);
            }
        }
    }


}
