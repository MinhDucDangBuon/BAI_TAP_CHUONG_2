package BAI_TAP_CHUONG_2.BAI_27;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

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

        scanner.close();
    }

    // Kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number < 2) {
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
Viết chương trình nhập vào một số nguyên n, sau đó tính tổng cácc số nguyên tố thuộc đoạn [1..] . Cho biết có bao nhiêu số nguyên tố thuộc đoạn đóViết chương trình nhập vào một số nguyên n, sau đó tính tổng cácc số nguyên tố thuộc đoạn [1..] .
Cho biết có bao nhiêu số nguyên tố thuộc đoạn đó
 */