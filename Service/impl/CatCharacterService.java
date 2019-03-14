package ru.geekbrains.lesson1_J2.Service.impl;

import ru.geekbrains.lesson1_J2.Service.CharacterService;
import ru.geekbrains.lesson1_J2.animals.ActType;

import ru.geekbrains.lesson1_J2.animals.CharacterValue;

public class CatCharacterService implements CharacterService {


    public CatCharacterService() {
    }

    @Override
    public CharacterValue getCharacterValue(ActType type, int power) {


        CharacterValue characterValue = new CharacterValue();
        if (type == ActType.JUMP) {
            characterValue.setValue(power);
            characterValue.setName(ActType.JUMP.toString());
        } else if (type == ActType.SWIM) {
            System.out.println("Кошка не умеет плавать");
        }
        return characterValue;
    }
}
