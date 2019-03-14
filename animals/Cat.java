package ru.geekbrains.lesson1_J2.animals;

import ru.geekbrains.lesson1_J2.Service.CharacterService;
import ru.geekbrains.lesson1_J2.Service.impl.CatCharacterService;

public class Cat extends Animal {
    public Cat(int age, String name, int power) {
        super(age, name, power);
    }

    private CharacterService characterService = new CatCharacterService();



    @Override
    public int jump() {
        CharacterValue characterValue = characterService.getCharacterValue(ActType.JUMP, getPower());
        return characterValue.getValue();
    }

    @Override
    public int swim() {
        CharacterValue characterValue = characterService.getCharacterValue(ActType.SWIM, getPower());
        return characterValue.getValue();
    }
    

}
