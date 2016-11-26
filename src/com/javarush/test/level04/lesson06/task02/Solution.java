package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sdata1 = reader.readLine();
        String sdata2 = reader.readLine();
        String sdata3 = reader.readLine();
        String sdata4 = reader.readLine();
        int a = Integer.parseInt(sdata1);
        int b = Integer.parseInt(sdata2);
        int c = Integer.parseInt(sdata3);
        int d = Integer.parseInt(sdata4);

        if (a > c && a > b && a > d)
        System.out.println( a );
        else if (b > a && b > c && b > d)
            System.out.println(b);
        else if (c > a && c > b && c > d)
            System.out.println(c);
        else if (d > a && d > b && d > c)
            System.out.println(d);
            //напишите тут ваш код

    }
}
