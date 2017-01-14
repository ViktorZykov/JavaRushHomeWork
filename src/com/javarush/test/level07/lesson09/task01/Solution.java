package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

/*public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> dividedthree = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {
            list.add( Integer.parseInt(br.readLine()) );
        }
        for (Integer x : list)
        {
            if (x % 3 == 0)
            {
                dividedthree.add(x);
            }
             if (x % 2 == 0)
            {
                even.add(x);
            }
            else if (x % 3 == 0 && x % 2 == 0)
            {
                even.add(x);
                dividedthree.add(x);
            }
            else
            {
                others.add(x);
            }
        }
        printList(dividedthree);
        printList(even);
        printList(others);//напишите тут ваш код
    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
*/
public class Solution// не совсем понятно но работает, верхняя часть тоже работае но не проходит тестирование
    // на сервере
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>gList = new ArrayList<Integer>();
        for (int i=0; i<20; i++)
            gList.add(Integer.parseInt(key.readLine()));
        ArrayList<Integer>threeList = new ArrayList<Integer>();
        ArrayList<Integer>twoList = new ArrayList<Integer>();
        ArrayList<Integer>anyList = new ArrayList<Integer>();
        for (int i=0; i < gList.size(); i++) {
            boolean x = false;
            if (gList.get(i) % 3 == 0 ) {
                threeList.add(gList.get(i));
                x = true;
            }
            if (gList.get(i) % 2 == 0  ) {
                twoList.add(gList.get(i));
                x = true;
            }
            if (!x) anyList.add(gList.get(i));
            /*if (!(gList.get(i) % 3 == 0) && !(gList.get(i) % 2 == 0))
                anyList.add(gList.get(i));*/
        }
        printList(threeList);
        printList(twoList);
        printList(anyList);
    }
    public static void printList(List<Integer> list) {
        for (int x: list)
            System.out.println(x);
    }
}
