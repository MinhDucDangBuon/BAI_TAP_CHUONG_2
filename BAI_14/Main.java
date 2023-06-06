package BAI_TAP_CHUONG_2.BAI_14;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập hệ số a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập hệ số b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập hệ số c: ");
            double c = scanner.nextDouble();

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép:");
                System.out.println("x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập số.");
        }
    }
}

/*viết chương trình giải và biện luận Phương trình bậc nhất theo hai hệ số a, b, c nhập từ bàn phím

 */

/*
Ví dụ với phương trình có hai nghiệm phân biệt:

Đầu vào: a = 1, b = -3, c = 2
Đầu ra:
Phương trình có hai nghiệm phân biệt:
x1 = 2.0
x2 = 1.0
Ví dụ với phương trình có nghiệm kép:

Đầu vào: a = 2, b = -4, c = 2
Đầu ra:
Phương trình có nghiệm kép:
x = 1.0
Ví dụ với phương trình vô nghiệm:

Đầu vào: a = 2, b = 1, c = 2
Đầu ra:
Phương trình vô nghiệm
 */