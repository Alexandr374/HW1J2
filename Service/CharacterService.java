package ru.geekbrains.lesson1_J2.Service;

import ru.geekbrains.lesson1_J2.animals.ActType;
import ru.geekbrains.lesson1_J2.animals.CharacterValue;

public interface CharacterService {
    CharacterValue getCharacterValue(ActType type, int power);
}
