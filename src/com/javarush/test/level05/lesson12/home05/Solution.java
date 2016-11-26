package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a;
        int sum = 0;
        while (!"сумма".equals(a = reader.readLine()))  //сравнением проверяется вводимое значение со словом "сумма"
        {
            sum += Integer.parseInt(a);// суммируются вводимые значения
        }

        System.out.println(sum);// выводится сумма
        //напишите
    }
}
