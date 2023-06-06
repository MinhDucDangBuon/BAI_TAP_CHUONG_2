package BAI_TAP_CHUONG_2.BAI_21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Giá trị biểu thức s = " + sum);
    }
}
//viết chương trình nhập vào 1 số nguyên n, sau đó tính giá trị biểu thức:s= 1+1/2+1/3+…+1/n//
