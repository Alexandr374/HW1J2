package ru.geekbrains.lesson1_J2;

import ru.geekbrains.lesson1_J2.animals.Animal;

public class Team {
    private String teamName;
    private Animal[] animal;

    public Team(String teamName, Animal[] animal) {
        this.teamName = teamName;
        this.animal = animal;
    }

    void showAllMembers(){
        System.out.println("Название команды: " + teamName);
        for(Animal animal:animal){
            System.out.println(animal.getName());
        }
    }
}
