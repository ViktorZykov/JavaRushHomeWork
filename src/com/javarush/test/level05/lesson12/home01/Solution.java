package com.javarush.test.level05.lesson12.home01;

/* Три класса
По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Cat cat1 = new Cat();// создаем объекты класса кот
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();// созаем объекты класса собака
        Dog dog2 = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);

        //напишите тут ваш код
    }

    public static class Duck
    {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat// создаем класс кот
    {
        public String toString() {
            return "Cat";
        }
    }
    public static class Dog// создаем класс собака
    {
        public String toString() {
            return "Dog";
        }
    }
    //напишите тут ваш код
}
