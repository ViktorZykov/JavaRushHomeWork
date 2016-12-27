package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];//создание массива на 10 чисел

        for (int i = 0; i < list.length; i++)//Ввести с клавиатуры 10 строчек и сохранить их в массив
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        } //напишите тут ваш код
        for (int i = list.length - 1; i >= 0; i--)// Вывести содержимое всего массива (10 элементов)
        // на экран в обратном порядке. Каждый элемент - с новой строки.
        {
            System.out.println(list[i]);
        } //напишите тут ваш код

    }
}
