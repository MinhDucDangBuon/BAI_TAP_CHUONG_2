package BAI_TAP_CHUONG_2.BAI_23;

import java.util.Scanner;

public class ExpressionSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thực x: ");
        double x = scanner.nextDouble();

        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        double sum = 0;

        if (n % 2 == 0) { // Nếu n là số chẵn
            double power = x; // Lưu giá trị x^k

            for (int k = 1; k <= n; k += 2) {
                sum += power / Math.pow(3, (k - 1) / 2);
                power *= x * x; // Cập nhật giá trị x^k cho lần lặp tiếp theo
            }
        }

        System.out.println("Giá trị biểu thức s = " + sum);
    }
}

/*
Viết chương trình nhập vào một số thực x và số nguyên n, sau đó tính giá trị biểu thức :
* s = x + ((x^2)/3) + ((x^3)/3^2) + ... + ((x^n)/3^n-1) nếu n chẵn
* s = 0 nếu n lẻ
 */