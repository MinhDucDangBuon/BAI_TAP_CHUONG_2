package BAI_TAP_CHUONG_2.BAI_24;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên n trong khoảng từ 10 đến 20: ");
            n = scanner.nextInt();

            if (n < 10 || n > 20) {
                System.out.println("Số n không nằm trong khoảng yêu cầu. Vui lòng nhập lại.");
            }
        } while (n < 10 || n > 20);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tổng các số liên tiếp từ 1 đến " + n + " là: " + sum);

        scanner.close();
    }
}

/*
Viết chương trình nhập vào một số nguyên n trong khoảng [10,20] ( nếu số nhập vào không phụ thuộc khoảng
đó thì yêu cầu nhập lại tới khi thoả mãn ). Sau đó tính tổng các số liên tiếp từ 1 tới n
 */