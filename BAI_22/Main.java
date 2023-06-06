package BAI_TAP_CHUONG_2.BAI_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double result;

        if (n == 0) {
            result = 0;
        } else if (n % 2 == 0) {
            result = calculateExpressionEven(n);
        } else {
            result = calculateExpressionOdd(n);
        }

        System.out.println("Giá trị của biểu thức F = " + result);
    }

    public static double calculateExpressionEven(int n) {
        double sum = 0.0;

        for (int i = 0; i <= n; i++) {
            sum += 1.0 / Math.pow(2, i);
        }

        return sum;
    }

    public static double calculateExpressionOdd(int n) {
        return Math.sqrt(Math.pow(n, 2) + 1);
    }
}
