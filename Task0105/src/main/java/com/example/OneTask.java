package com.example;
//Напишите программу на Java для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций.
//Для начала инициализируем строковую переменную st и используем класс StringBuilder.
//        Объект класса StringBuilder strB будет в дальнейшем использоваться для добавления значения, хранящегося в строковой переменной st.
//        После этого мы используем встроенную в StringBuilder функцию reverse() и сохраняем новую - обращенную строку в stB.
//        Наконец, мы выводим на экран stB.

public class OneTask {
    public static void main(String[] args) {
        String st1 = "папка";
        StringBuilder stB= new StringBuilder();
        stB.append(st1);
        stB = stB.reverse();

        System.out.println(stB);
    }
}