package lesson2;

import java.util.Scanner;

public class Task4 {

//    Определить число, полученное выписыванием в обратном порядке цифр
//    любого 4-х значного натурального числа n.

    public static void main(String[] args) {

        System.out.println("Enter a 4-digit number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int thousands;
        int hundreds;
        int dozens;
        int units;

        thousands = number / 1000;
        hundreds  = ((number % 1000) / 100);
        dozens = ((number % 1000) % 100) / 10;
        units = number % 10;

        System.out.println(units * 1000 + dozens * 100 + hundreds * 10 + thousands);
    }
}
