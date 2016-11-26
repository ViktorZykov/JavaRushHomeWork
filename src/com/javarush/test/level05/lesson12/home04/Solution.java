package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution
{
    public static void main(String[] args)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        Calendar curTime = new GregorianCalendar();
        System.out.println(formatter.format(curTime.getTime())); //напишите тут ваш код
    }
}
