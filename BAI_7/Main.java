package BAI_TAP_CHUONG_2.BAI_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n;

            do {
                System.out.print("Nhập số nguyên n trong khoảng [10, 20]: ");
                n = scanner.nextInt();
            } while (n < 10 || n > 20);

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Tổng các số từ 1 tới " + n + " là: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại số nguyên trong khoảng từ 10 đến 20.");
        }
    }
}
/*
viết chương trình nhập vào 1 số nguyên n trong khoảng [10,20] (nếu số nhập vào không thuộc khoảng
 đó thì yêu cầu nhập lại tới khi thỏa mãn).
Sau đó tính tổng các số liên tiếp từ 1 tới n
 */
