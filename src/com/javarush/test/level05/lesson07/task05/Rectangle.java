package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int left;
    private int top;
    private int height;
    private int width;
    private String Rectangle;

    public void initialize(int left, int top, int height, int width)
    {
       this.left = left;
        this.top = top;
        this.height = height;
        this.width = width;
    }//напишите тут ваш код
    public void initialize(int left, int top)
    {
        this.left = left;
        this.top = top;
        this.height = 0;
        this.width = 0;
    }
    public void initialize(int left, int top, int height)
    {
        this.left = left;
        this.top = top;
        this.height = width;
    }
    public void initialize(String Rectangle)
    {
    this.Rectangle = Rectangle;
    }

}
