package com.javarush.test.level04.lesson01.task02;

/* Реализовать метод addPrice
Реализовать метод addPrice(int applesPrice), чтобы при его вызове суммарная стоимость яблок увеличивалось на переданное значение.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
*/
public class Solution
{
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple.addPrice(50);
        Apple apple2 = new Apple();
        Apple.addPrice(100);
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple{
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice){
            Apple.applesPrice = applesPrice + applesPrice;
            System.out.println("The appleprice is: " + Apple.applesPrice);
            //напишите тут ваш
            // Apple.applesPrice - это переменная класса Apple,
            // а applesPrice - переменная метода addPrice(в первый раз туда передалось 50, второй раз 100),
            // В самом методе мы увеличиваем суммарную стоимость яблок(за суммарную стоимость яблок отвечает переменная public static int applesPrice,
            // то есть Apple.applesPrice) на передаваемое число(то есть applesPrice)
            // Пойдём по порядку:
           // Apple apple = new Apple(); //создание объекта apple класса Apple.
            //Apple.addPrice(50); //вызов метода addPrice и передача значения 50 в переменную applesPrice (которая является аргументом метода, т.е. addPrice(int applesPrice)).
// В методе происходит следующее: Переменной Apple.applesPrice (это статическая переменная класса Apple, начальное значение которой равно 0) присваивается (=) результат выполнения выражения Apple.applesPrice + applesPrice, т.е. 0+50. /
                   // Теперь статическая переменная applesPrice, класса Apple, которая имела значение 0, теперь равна 50.
            //Далее:
            //Apple apple2 = new Apple(); //создание объекта apple2 класса Apple.
            //Apple.addPrice(100); //вызов метода addPrice и передача значения 100 в переменную applesPrice (которая является аргументом метода, т.е. addPrice(int applesPrice)).
// При втором вызове метода происходит следующее: Переменной Apple.applesPrice, значение которой после первого вызова метода addPrice стало равно 50) присваивается (=) результат выполнения выражения Apple.applesPrice + applesPrice, т.е. 50+100. /
                    //Ну и далее выводится строка с конечным значением: "Apples price is 150".

        }
    }
}
