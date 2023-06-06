package BAI_TAP_CHUONG_2.BAI_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập một số nguyên n: ");
            int n = scanner.nextInt();

            // Kiểm tra n là chẵn hay lẻ
            if (n % 2 == 0) {
                System.out.println(n + " là số chẵn");
            } else {
                System.out.println(n + " là số lẻ");
            }

            // Tính giá trị biểu thức F(x)
            double x = n; // Chuyển n sang kiểu double
            double result = (Math.pow(x, 2) + Math.exp(Math.abs(x)) + Math.pow(Math.sin(x), 2)) / Math.pow(Math.pow(x, 2) + 1, 1.0 / 5);
            System.out.println("Giá trị biểu thức F(" + n + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập không hợp lệ. Vui lòng nhập một số nguyên.");
        }
    }
}
/*
viết chương trình tính giá trị biểu thức:F(x) = (x^2 + e^|x| + sin^2 (x))/căn bậc 5 của (x^2 +1).
Viết chương trình nhập vào một số nguyên n. Kiểm tra xem n chẵn hay lẻ
 */
