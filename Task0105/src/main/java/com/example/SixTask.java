package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//6) Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.
//Здесь мы для начала вставили три элемента в переменную типа HashMap с именем keyValue, используя функцию put().
//
//        Размер переменной keyValue можно получить с помощью метода size(). После этого мы использовали цикл Whil
//        e для обхода keyValue, которая содержит по одной паре ключ-значение для каждого элемента. Ключи и значения могут
//        быть получены с помощью методов getKey() и getValue().
//        Аналогично, мы используем расширенный цикл for, на элементах «qurentMe2» в HashMap.
public class SixTask {
    public static void main(String[] args) {
        HashMap<Integer,String> keyValue = new HashMap<Integer,String>();

        keyValue.put(1, "Hello");
        keyValue.put(2, "World");
        keyValue.put(3, "Have a nice day!");

        System.out.println(keyValue.size());
        System.out.println("Cycle while");
        Iterator iter = keyValue.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry qurentMe= (Map.Entry) iter.next();
            System.out.println("ключ это  "+ qurentMe.getKey()+" Значение это "+ qurentMe.getValue());

        }

        System.out.println("Цикл For:");

        for(Map.Entry qurentMe2: keyValue.entrySet()) {

            System.out.println("Ключ это: " + qurentMe2.getKey() + " Значение это: " + qurentMe2.getValue());

        }
    }

}
