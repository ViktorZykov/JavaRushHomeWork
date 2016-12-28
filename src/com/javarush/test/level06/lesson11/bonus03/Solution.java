package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.util.Arrays;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] biglist = new int[5];//создание массива на 5 чисел
        for (int i = 0; i < biglist.length; i++)
        {
            String s = reader.readLine();//Ввести в него значения с клавиатуры
            biglist[i] = Integer.parseInt(s);
        }
        Arrays.sort( biglist );

        for ( int i : biglist )
        {
            System.out.println( i );
        }
    }
}
