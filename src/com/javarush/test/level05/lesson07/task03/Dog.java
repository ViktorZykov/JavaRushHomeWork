package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private String height;
    private String color;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, String height)
    {
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, String height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }//напишите тут ваш код

}
