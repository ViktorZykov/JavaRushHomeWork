package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat
{
    String name;
    int age;
    int weight;
    int strength;

    public static void main(String[] args)
    {

        Cat cat = new Cat();
        cat.name = "vaska";
        cat.age = 20;
        cat.weight = 3;
        cat.strength = 7;//напишите тут ваш код
    }
}