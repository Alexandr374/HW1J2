package ru.geekbrains.lesson1_J2.Service.impl;

import ru.geekbrains.lesson1_J2.Service.CharacterService;
import ru.geekbrains.lesson1_J2.animals.ActType;
import ru.geekbrains.lesson1_J2.animals.Animal;
import ru.geekbrains.lesson1_J2.animals.CharacterValue;

public class CatCharacterService implements CharacterService {

    private Animal[] animal;

    public CatCharacterService(Animal[]animal) {
        this.animal = animal;
    }

    public CatCharacterService() {
    }

    @Override
    public CharacterValue getCharacterValue(ActType type, int power) {


        CharacterValue characterValue = new CharacterValue();
        if (type == ActType.JUMP){
            int value = animal[0].getPower();
            characterValue.setValue(value);
            characterValue.setName(ActType.JUMP.toString());
        }else if (type == ActType.SWIM){
            System.out.println("Кошки не любят плавать");
        }
        return characterValue;
    }
}
