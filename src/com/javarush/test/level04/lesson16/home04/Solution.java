package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int y = Integer.parseInt(a); //напишите тут ваш код
        int m = Integer.parseInt(b); //напишите тут ваш код
        int d = Integer.parseInt(c);
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);//напишите тут ваш код
    }
}
