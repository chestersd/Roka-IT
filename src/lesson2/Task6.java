package lesson2;

import java.util.Scanner;

//Создайте число.
// Определите, является ли число трехзначным.
// Определите, является ли его последняя цифра семеркой.
// Определите, является ли число четным.
public class Task6 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean hasThreeDigits = number / 100 <= 9;
        boolean lastDigitEqualsSeven = number % 10 == 7;
        boolean isEven = (number % 10) % 2 == 0;

        System.out.println("Your number has 3 digits: " + hasThreeDigits);
        System.out.println("Last digit of your number equals 7: " + lastDigitEqualsSeven);
        System.out.println("Last digit of your number is even: " + isEven);

    }
}

