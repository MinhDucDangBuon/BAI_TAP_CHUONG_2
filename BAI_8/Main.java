package BAI_TAP_CHUONG_2.BAI_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số nguyên n: ");
            int n = scanner.nextInt();

            if (n < 2) {
                throw new IllegalArgumentException("Giá trị n phải lớn hơn hoặc bằng 2.");
            }

            int sum = 0;
            int count = 0;

            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    sum += i;
                    count++;
                }
            }

            System.out.println("Tổng các số nguyên tố từ 1 đến " + n + " là: " + sum);
            System.out.println("Số lượng số nguyên tố từ 1 đến " + n + " là: " + count);
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại số nguyên.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
/*
viết chương trình nhập vào số nguyên n, sau đó tính tổng các số nguyên tố thuộc đoạn [1..n].
cho biết có bao nhiêu số nguyên tố thuộc đoạn đó
 */
