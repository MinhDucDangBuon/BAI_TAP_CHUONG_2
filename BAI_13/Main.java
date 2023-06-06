package BAI_TAP_CHUONG_2.BAI_13;

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

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -b / a;
                System.out.println("Phương trình có nghiệm duy nhất x = " + x);
            }
        } catch (InputMismatchException e) {
            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập số.");
        }
    }
}

//viết chương trình giải và biện luận Phương trình bậc nhất theo hai hệ số a, b nhập từ bàn phím//
