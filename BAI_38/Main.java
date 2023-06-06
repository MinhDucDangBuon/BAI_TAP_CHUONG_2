package BAI_TAP_CHUONG_2.BAI_38;

import java.util.Scanner;

class MaximumDigit {
    public static void main(String[] args) {
        printStars();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int maxDigit = getMaximumDigit(n);
        int sumDigit = getSumDigit(n);

        System.out.println("Chữ số lớn nhất trong số đã cho: " + maxDigit);
        System.out.println("Tổng các chữ số trong số đã cho: " + sumDigit);

        printStars();
    }

    public static int getMaximumDigit(int n) {
        int maxDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n /= 10;
        }

        return maxDigit;
    }

    public static int getSumDigit(int n) {
        int sumDigit = 0;

        while (n > 0) {
            sumDigit += n % 10;
            n /= 10;
        }

        return sumDigit;
    }

    public static void printStars() {
        System.out.println("********************");
    }
}
public class Main {
    public static void main(String[] args) {
        MaximumDigit.main(null);
    }
}

