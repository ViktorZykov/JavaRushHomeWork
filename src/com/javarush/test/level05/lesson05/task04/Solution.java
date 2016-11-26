package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("vaska", 20, 3, 7 );
        cat1.name = "vaska";
        cat1.age = 20;
        cat1.weight = 3;
        cat1.strength = 7;
        Cat cat2 = new Cat("murzik", 10, 4, 2);
        cat2.name = "murzik";
        cat2.age = 10;
        cat2.weight = 4;
        cat2.strength = 2;
        Cat cat3 = new Cat("zzz", 6, 3, 1);
        cat3.name = "zzz";
        cat3.age = 6;
        cat3.weight = 3;
        cat3.strength = 1;
        //напишите тут ваш код
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }


    }
}
