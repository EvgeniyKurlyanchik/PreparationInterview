package com.example.preparationinterview.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
     LinkedList<String>  linkedList = new LinkedList<>();

     linkedList.addLast("A");
        linkedList.addLast("S");
        linkedList.addLast("D");
        linkedList.addLast("F");

        System.out.println("LList::  " + linkedList);

        linkedList.addFirst("B");
        System.out.println("LList::  " + linkedList);

        System.out.println("Index value E: " + linkedList.get("D"));
        System.out.println("Index value V: " + linkedList.get("V"));

        linkedList.remove("F");
        System.out.println("LList :: " + linkedList);

    }
}
