package com.example;
//# 15) Напишите программу на Java, чтобы найти повторяющиеся символы в строке.
//        Ответ:
//
//        В этой программе мы создаем строковую переменную st и инициализируем целочисленный счетчик, начиная с нуля.
//
//        Затем мы создали массив символов для преобразования нашей строковой переменной в этот массив. С помощью двух
//        циклов for мы проводим сравнение символов с разными индексами.
//
//        Если два символа последовательного индекса совпадают, то этот символ будет выведен на
//        экран и счетчик количества совпадающих символов увеличится на 1.
public class ElevenTask {
    public static void main(String[] args) {
        String st = new String("Heliicopttehh");
        int counter = 0;
        char[] charsArray = st.toCharArray();
        System.out.println("Повторяющиеся символы тут:");
        for (int i = 0; i <st.length() ; i++) {
            for (int j = i+1; j <st.length() ; j++) {
               if (charsArray[i]==charsArray[j]){

                   System.out.println(charsArray[j]);
                   counter ++;
                   break;
               }
            }
        }
    }
}
