package lesson2;

import java.util.Random;
import java.util.Scanner;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.
public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();

        int lastDigit;
        String rubles = null;

        lastDigit = x % 10;

        lastDigit = switch (rubles){
            case 0 -> " рублей" ;
            case 1 -> " рубль" ;
            case 2 -> " рубля" ;
            case 3 -> " рубля" ;
            case 4 -> " рубля" ;
            case 5 -> " рублей" ;
            case 6 -> " рублей" ;
            case 7 -> " рублей" ;
            case 8 -> " рублей" ;
            case 9 -> " рублей" ;

        };
        System.out.println("У Вас " + x + rubles);

    }

}
