package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.

Для решения все было в теории урока. Почему [2]? Потому что [0] элемент получаемого массива - это сам getStackTrace,
 [1] - это наш метод, в котором мы находимся и запустили getStackTrace, [2] - метод, который и вызвал наш метод,
  и который по условию задачи надо вернуть.
Соответственно [3] - это метод, который вызвал тот метод, который вызвал наш метод. И так дойдем и до main.

*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();

        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getMethodName(); //напишите тут ваш код

    }

    public static String method2()
    {
        method3();
        //напишите тут ваш код
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getMethodName();
    }

    public static String method3()
    {
        method4();
        //напишите тут ваш код
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getMethodName();
    }

    public static String method4()
    {
        method5();
        //напишите тут ваш код
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getMethodName();
    }

    public static String method5()
    {
        //напишите тут ваш код
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getMethodName();
    }
}
