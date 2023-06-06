package BAI_TAP_CHUONG_2.BAI_25;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Số n phải là số nguyên dương. Vui lòng nhập lại.");
            }
        } while (n <= 0);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Tổng các số chẵn trong đoạn [1, " + n + "]: " + evenSum);
        System.out.println("Tổng các số lẻ trong đoạn [1, " + n + "]: " + oddSum);

        scanner.close();
    }
}


/**
 * Viết chương trình nhập vào một số nguyên dương n , sau đó tính tổng các giá trị chẵn, lẻ thuộc đoạn [1,n]
 */
