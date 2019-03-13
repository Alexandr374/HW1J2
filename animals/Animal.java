package ru.geekbrains.lesson1_J2.animals;

import ru.geekbrains.lesson1_J2.Course.Jump;
import ru.geekbrains.lesson1_J2.Course.Swim;

public abstract class Animal implements Jump, Swim {
    private int age;
    private String name;
    private int power;

    public Animal(int age, String name, int power) {
        this.age = age;
        this.name = name;
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
