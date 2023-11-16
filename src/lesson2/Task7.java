package lesson2;
//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Enter side A");
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        System.out.println("Enter side B");
        int sideB = scanner.nextInt();
        System.out.println("Enter radius");
        int radius = scanner.nextInt();

        double diagonal = Math.sqrt(sideA * sideA + sideB * sideB);

        if (diagonal <= radius * 2) {
            System.out.println("Round picture can close the rectangle");
        } else {
            System.out.println("Round picture can't close the rectangle");
        }
    }
}
