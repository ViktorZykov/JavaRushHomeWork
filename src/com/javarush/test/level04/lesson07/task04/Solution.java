package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        if ((a>=0)&&(b>=0)&&(c>=0)){
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 3"); }
        else if (((a>=0)&&(b<=0)&&(c>=0))||((a>=0)&&(b>=0)&&(c<=0))||((a<=0)&&(b>=0)&&(c>=0))){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");}
        else if (((a>=0)&&(b<=0)&&(c<=0))||((a<=0)&&(b>=0)&&(c<=0))||((a<=0)&&(b<=0)&&(c>=0))){
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");}
         else if ( a<0&&b<0&&c<0){
            System.out.println("количество отрицательных чисел: 3");
            System.out.println("количество положительных чисел: 0");  //напишите тут ваш код
        }

    }
}
