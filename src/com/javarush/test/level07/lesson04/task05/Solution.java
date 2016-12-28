package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] biglist = new int[20];//создание массива на 20 чисел
        int[] firstlist = new int[10];//создание массива на 10 чисел
        int[] secondlist = new int[10];//создание массива на 10 чисел
        for (int i = 0; i < biglist.length; i++)
        {
            String s = reader.readLine();//Ввести в него значения с клавиатуры
            biglist[i] = Integer.parseInt(s);
            if (i < 10)
            {
                firstlist[i] = biglist[i];//половину чисел в первый маленький,
            }
            else
            {
                secondlist[i - 10] = biglist[i];//вторую половину во второй маленький.
            }
        }
        for (int a : secondlist)
        {
            System.out.println(a);//Вывести второй маленький массив на экран
        }
    }
}
