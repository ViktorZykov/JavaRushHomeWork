package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int a = Integer.parseInt(sdata1);
        int b = Integer.parseInt(sdata2);
        int c = Integer.parseInt(sdata3);
        if (a < b && a < b && b < c)
            System.out.println( c + " " + b + " " + a );
        else if ( b < a && b < c && a < c)
            System.out.println(c + " " + a + " " + b);
        else if ( b > a && b > c && a > c )
            System.out.println(b + " " + a + " " + c);
        else if ( b > c && b > a && c > a)
            System.out.println(b + " " + c + " " + a);
        else if ( a > c && a > b && c > b)
            System.out.println(a + " " + c + " " + b);
        else if ( a > b && a > c && b > c)
            System.out.println(a + " " + b + " " + c);//напишите тут ваш код

    }
}
