package BAI_TAP_CHUONG_2.BAI_19;
import java.math.BigInteger;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương n: ");
        int n = scanner.nextInt();

        System.out.println("Chọn cách tính giai thừa:");
        System.out.println("1. Sử dụng vòng lặp for");
        System.out.println("2. Sử dụng vòng lặp while");
        System.out.println("3. Sử dụng vòng lặp do-while");
        System.out.println("4. Sử dụng đệ quy");
        System.out.println("5. Sử dụng phương pháp khác");

        System.out.print("Lựa chọn của bạn: ");
        int choice = scanner.nextInt();

        long factorial;
        switch (choice) {
            case 1:
                factorial = calculateFactorialForLoop(n);
                break;
            case 2:
                factorial = calculateFactorialWhileLoop(n);
                break;
            case 3:
                factorial = calculateFactorialDoWhileLoop(n);
                break;
            case 4:
                factorial = calculateFactorialRecursive(n);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                return;
        }

        System.out.println("Giai thừa của " + n + " là " + factorial);
    }

    public static long calculateFactorialForLoop(int n) {
        long factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static long calculateFactorialWhileLoop(int n) {
        long factorial = 1;
        int i = 2;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        return factorial;
    }

    public static long calculateFactorialDoWhileLoop(int n) {
        long factorial = 1;
        int i = 2;

        do {
            factorial *= i;
            i++;
        } while (i <= n);

        return factorial;
    }

    public static long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFactorialRecursive(n - 1);
    }
}
