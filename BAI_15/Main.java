package BAI_TAP_CHUONG_2.BAI_15;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các hệ số của hệ phương trình:");

        try {
            System.out.print("a1: ");
            double a1 = scanner.nextDouble();

            System.out.print("b1: ");
            double b1 = scanner.nextDouble();

            System.out.print("c1: ");
            double c1 = scanner.nextDouble();

            System.out.print("a2: ");
            double a2 = scanner.nextDouble();

            System.out.print("b2: ");
            double b2 = scanner.nextDouble();

            System.out.print("c2: ");
            double c2 = scanner.nextDouble();

            double D = a1 * b2 - a2 * b1;
            double Dx = c1 * b2 - c2 * b1;
            double Dy = a1 * c2 - a2 * c1;

            if (D != 0) {
                double x = Dx / D;
                double y = Dy / D;
                System.out.println("Hệ phương trình có nghiệm duy nhất:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            } else {
                if (Dx == 0 && Dy == 0) {
                    System.out.println("Hệ phương trình có vô số nghiệm");
                } else {
                    System.out.println("Hệ phương trình vô nghiệm");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập số thực.");
        }
    }
}


//viết chương trình giải và biện luận hệ Phương trình bậc nhất 2 ẩn bằng Phương pháp định thức//
