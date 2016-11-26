package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sdata1 = reader.readLine();
        String sdata2 = reader.readLine();
        int ndata1 = Integer.parseInt(sdata1);
        int ndata2 = Integer.parseInt(sdata2);
        System.out.print(name + " получает " + ndata1 + " через " + ndata2 + " лет.");//напишите тут ваш код
        //напишите тут ваш код

    }
}