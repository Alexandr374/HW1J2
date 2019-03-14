package ru.geekbrains.lesson1_J2;

import ru.geekbrains.lesson1_J2.Obstacle.Course;
import ru.geekbrains.lesson1_J2.Obstacle.Obstacle;
import ru.geekbrains.lesson1_J2.Obstacle.Wall;
import ru.geekbrains.lesson1_J2.Obstacle.Water;
import ru.geekbrains.lesson1_J2.animals.Animal;
import ru.geekbrains.lesson1_J2.animals.Cat;
import ru.geekbrains.lesson1_J2.animals.Dog;
import ru.geekbrains.lesson1_J2.animals.Human;

//1. Разобраться с имеющимся кодом;
//2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
//    (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации
//     о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
//3. Добавить класс Action (полоса препятствий), в котором будут находиться: массив препятствий,
//   метод который будет просить команду пройти всю полосу;
//
//   То есть в итоге должно быть:
//public static void main(String[] args) {
//Action c = new Action(...); // Создаем полосу препятствий
//Team team = new Team(...); // Создаем команду
//c.doIt(team); // Просим команду пройти полосу
//team.showResults(); // Показываем результаты
//}
public class Main {

    public static void main(String[] args) {
        Animal[] animal = {
                new Cat(4,"Вася", 5),
                new Dog(3,"Бобик",3),
                new Human(30,"Генадий",10)
        };
        Team team = new Team("Loosers", animal);
        team.showAllMembers();
        Obstacle[] obstacles = {new Wall(3), new Water(8)};
        Course course = new Course(obstacles, animal);
        course.doIt(team);

        System.out.println(animal[0].getName() + " прыгнул на " + animal[0].jump() + " м");
        System.out.println(animal[0].swim());

    }
}
