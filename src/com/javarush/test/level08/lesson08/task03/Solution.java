package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> people = new HashMap<String, String>();

        people.put("Ivanov", "Ivan");
        people.put("Petrov", "Peta");
        people.put("Sidorov", "Serg");
        people.put("Smirnov", "Sema");
        people.put("Nemiroff", "Vasilij");
        people.put("Ivanova", "Sofia");
        people.put("Rembo", "John");
        people.put("Smirnoff", "Vovan");
        people.put("Cameron", "Dias");
        people.put("Napoleone", "Buonaparte");

        return people;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        return map.containsKey( lastName) ? 1 : 0;
    }
}
