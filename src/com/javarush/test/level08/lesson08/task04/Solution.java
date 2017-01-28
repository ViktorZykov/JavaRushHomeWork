package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone",                 new Date("JUNE 1 1980"));
        map.put("Schwarzenegger",           new Date("JULY 30 1947"));
        map.put("Andriy Shevchenko",        new Date("NOVEMBER 3 1980"));
        map.put("Maradona",                 new Date("OCTOBER 18 1960"));
        map.put("Messi",                    new Date("SEPTEMBER 12 1983"));
        map.put("Ronaldo",                  new Date("NOVEMBER 27 1990"));
        map.put("Ronaldinio",               new Date("APRIL 7 1989"));
        map.put("Kann",                     new Date("MARCH 10 1970"));
        map.put("Platini",                  new Date("MARCH 19 1955"));
        map.put("Gusev",                    new Date("APRIL 10 1981"));

        return map;


    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
        }

    }
}
