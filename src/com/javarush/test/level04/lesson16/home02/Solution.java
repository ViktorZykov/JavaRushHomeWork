package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sdata1 = reader.readLine();
        String sdata2 = reader.readLine();
        String sdata3 = reader.readLine();
        int a = Integer.parseInt(sdata1); //напишите тут ваш код
        int b = Integer.parseInt(sdata2); //напишите тут ваш код
        int c = Integer.parseInt(sdata3);
        if ((a<b && c>b) || (a>b && b>c))
            System.out.println(b);
        else if ((a>b && a<c) || (a>c && a<b))
            System.out.println(a);
        else if ((a<b && b>c) || (a>b &&b<c))
            System.out.println(c);//напишите тут ваш код cреднее может стоять только в трех позициях
                                    // в начале по середине и в конце
    }
}
