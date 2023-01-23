package com.example.preparationinterview.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //Добавление элементов в Arraylist
        list.add("Tom");
        list.add("Bob");
        list.add("Jack");
        System.out.println(list);
        //Возвращение по номеру индекса
        System.out.println(list.get(1));

// размер списка. удаление элемента

        Person person1 = new Person("Григорий");
        Person person2 = new Person("Вася");
        Person person3 = new Person("Петя");

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(person1);
        list1.add(person3);
        list1.add(person2);
        System.out.println(list1);
        System.out.println(list1.size());
        list1.remove(1);
        System.out.println(list1.size());

        //Вставка списка в существующий список
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(person1);
        list2.add(person3);
        list1.addAll(2,list2);
        System.out.println(list1);

        //Очистка списка, проверка "пустой"
        list1.clear();
        System.out.println( list1.isEmpty());

        //проверка элемента на присутствие в списке
        System.out.println(list2.contains(person1));
        System.out.println(list2.contains(person2));


        //найти номер индекса по имени
        System.out.println(list.indexOf("Jack"));
    }

}
