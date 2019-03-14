package ru.geekbrains.lesson1_J2.Service.impl;

import ru.geekbrains.lesson1_J2.Service.CharacterService;
import ru.geekbrains.lesson1_J2.animals.ActType;
import ru.geekbrains.lesson1_J2.animals.Animal;
import ru.geekbrains.lesson1_J2.animals.CharacterValue;

public class HumanCharacterService implements CharacterService {
    private Animal[] animal;

    public HumanCharacterService(Animal[] animal){
        this.animal = animal;
    }

    public HumanCharacterService(){

    }

    @Override
    public CharacterValue getCharacterValue(ActType type, int power) {
        CharacterValue characterValue = new CharacterValue();
        if (type == ActType.JUMP){
            int value = power;
            characterValue.setValue(value);
            characterValue.setName(ActType.JUMP.toString());
        }else if (type == ActType.SWIM){
            characterValue.setValue(power);
            characterValue.setName(ActType.SWIM.toString());
        }
        return characterValue;
    }
}
