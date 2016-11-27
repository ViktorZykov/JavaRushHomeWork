package com.javarush.test.level05.lesson12.bonus03;
/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;
        int N = Integer.parseInt(reader.readLine());
        for (int i=1; i<=N; i++){
            int a=Integer.parseInt(reader.readLine());
            if (maximum < a)
                maximum = a;
        }
        System.out.println(maximum);
    }
}
