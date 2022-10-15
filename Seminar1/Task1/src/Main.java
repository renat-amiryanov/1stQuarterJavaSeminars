/*
Написать программу вычисления n-ого треугольного числа. url
 */

import java.util.Scanner;

public class Main {
    public static int CalculateTriangularNumber(int n){

        int triangularNumber = 0;

        for (int i = 1;i <= n; i++){
           triangularNumber += i;
        }
        return triangularNumber;
    }

    public static void DisplayTriangualarNumber(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число n для вычисления " +
                            "n-ого треугольного числа: ");

        int n = input.nextInt();

        System.out.println("Треугольное число " + n +
                            " это " + CalculateTriangularNumber(n));

    }

    public static void main(String[] args) {
        DisplayTriangualarNumber();
    }
}