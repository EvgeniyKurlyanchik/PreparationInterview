package com.example;
// Напишите программу на Java для переворота последовательности символов в строке без использования встроенной в String функции reverse().
//Есть несколько способов, с помощью которых вы можете перевернуть вашу строку, если вам разрешено использовать другие встроенные функции строки.
//
//        В этом способе мы инициализируем строковую переменную с именем st значением
//        заданной строки. Затем мы конвертируем эту строку в массив символов с помощью функции toCharArray().
//        После этого мы используем цикл for чтобы взять все символы в обратном порядке и вывести их так на экран поочередно.

import java.util.Scanner;

public class ToTask {
    public static void main(String[] args) {
     String st2 = "Программирование";
     char symbols[] = st2.toCharArray();
        for (int x = symbols.length-1; x>=0 ; x--) {
            System.out.print(symbols[x]);
        }
        String st3;

        Scanner scannerQ = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Введите вашу строку:");

        st3 = scannerQ.nextLine();

        String[] temp = st3.split("");    //используем метод split для вывода строки в обратном порядке

        for(int x= temp.length-1; x>=0; x--)

        {

            System.out.print(temp [x] + "");

        }
    }

}
