package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sdata = reader.readLine();
        int ndata = Integer.parseInt(sdata);
        if (ndata > 0)
        {
            ndata = ndata * 2;
            System.out.println(ndata);
        }
        else{
            ndata = ndata + 1;
            System.out.println(ndata);
        }
        //напишите тут ваш код

    }

}