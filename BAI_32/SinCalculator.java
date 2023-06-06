package BAI_TAP_CHUONG_2.BAI_32;

import java.util.Scanner;

public class SinCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the value of ε: ");
        double epsilon = scanner.nextDouble();

        double sinX = calculateSin(x, epsilon);
        System.out.println("sin(" + x + ") = " + sinX);
    }

    public static double calculateSin(double x, double epsilon) {
        double term = x;
        double sinX = term;
        int n = 1;

        while (Math.abs(term) >= epsilon) {
            term = -term * x * x / ((2 * n) * (2 * n + 1));
            sinX += term;
            n++;
        }

        return sinX;
    }
}

