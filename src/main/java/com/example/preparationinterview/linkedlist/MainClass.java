package com.example.preparationinterview.linkedlist;


import com.example.preparationinterview.arraylist.Person;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        Person person1 = new Person("Маша");
        Person person2 = new Person("Оля");
        Person person3 = new Person("Света");
        Person person4 = new Person("Ирина");
        //Добавление в список
        list.add(person1);
        list.add(person2);
        list.add(person3);
        System.out.println(list);

        //Добавление в начало
        list.addFirst(person4);
        list.addLast(person4);
        //Выборка элемента(первый-последний)
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        //Удаление по индексу
        list.remove(0);
        System.out.println(list);

        //Проверка наличия элемента
        System.out.println(list.contains(person4));

       //очистка
        list.clear();
        System.out.println(list);
}}
