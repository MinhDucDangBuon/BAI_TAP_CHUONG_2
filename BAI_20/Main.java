package BAI_TAP_CHUONG_2.BAI_20;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int start = n;
        int end = 2 * n;

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Tổng các số nguyên tố trong đoạn [" + start + ", " + end + "] là: " + sum);
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

//nhập vào một số nguyên n. Tính tổng các số nguyên tố trong giai đoạn [n,2n].
// Đánh giá độ phức tạp của giải thuật trong trường hợp tồi nhất//
/*
Độ phức tạp của giải thuật này trong trường hợp tồi nhất xảy ra khi số n là một số nguyên tố và
cần kiểm tra tất cả các số từ n đến 2n để tìm các số nguyên tố.
Trong trường hợp này, độ phức tạp của giải thuật sẽ là O(n * √n), với n là số nhập vào.
 */