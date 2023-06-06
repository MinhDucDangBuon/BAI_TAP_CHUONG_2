package BAI_TAP_CHUONG_2.BAI_33;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        int combination = calculateCombination(n, m);
        System.out.println("C(" + m + ", " + n + ") = " + combination);
    }

    public static int calculateCombination(int n, int m) {
        int numerator = 1;
        int denominator = 1;

        for (int i = 0; i < m; i++) {
            numerator *= (n - i);
            denominator *= (i + 1);
        }

        int combination = numerator / denominator;
        return combination;
    }
}



/*
Lập trình để tính tổ hợp chập m của n theo công thức
C(m,n) = (n(n-1)...(n-m+1))/m!

 */