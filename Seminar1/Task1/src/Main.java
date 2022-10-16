/*
Написать программу вычисления n-ого треугольного числа. url
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int CalculateTriangularNumber(int n) {
        int triangularNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }

        return triangularNumber;
    }

    public static String getString() throws IOException {
        // Метод возвращает строку введенную пользователем.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        // Метод преобразует ввод к типу int и возвращает его
        String s = getString();
        return Integer.parseInt(s);
    }

    public static void DisplayTriangualarNumber() throws IOException {
        System.out.printf("Введите число n для вычисления " +
                "n-ого треугольного числа: ");
        int n = getInt();
        System.out.println("Треугольное число " + n +
                " это " + CalculateTriangularNumber(n));

    }
    public static void main(String[] args) throws IOException {
        DisplayTriangualarNumber();
    }
}