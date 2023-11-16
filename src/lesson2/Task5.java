package lesson2;

import java.util.Scanner;

//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?
public class Task5 {
    public static void main(String[] args) {

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;
        boolean areEqual;

        System.out.println("Enter a 4-digit number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        firstDigit = number % 10;
        secondDigit = ((number % 1000) % 100) / 10;
        thirdDigit = ((number % 1000) / 100);
        fourthDigit = number / 1000;

        if (firstDigit == secondDigit && thirdDigit == fourthDigit && firstDigit == thirdDigit) {
            areEqual = true;
        } else {
            areEqual = false;
        }

        System.out.println("All digits are different: " + areEqual);

    }

}
