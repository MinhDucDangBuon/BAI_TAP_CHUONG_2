package BAI_TAP_CHUONG_2.BAI_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số vốn a (đơn vị đồng): ");
            double a = scanner.nextDouble();

            System.out.print("Nhập lãi suất s (% mỗi tháng): ");
            double s = scanner.nextDouble();

            System.out.print("Nhập số tháng t: ");
            int t = scanner.nextInt();

            System.out.println("Số tháng\tTổng số tiền (đồng)");
            double totalAmount = a;
            for (int i = 1; i <= t; i++) {
                double interest = totalAmount * s / 100;
                totalAmount += interest;

                System.out.println(i + "\t\t" + totalAmount);
            }
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại số vốn và lãi suất dưới dạng số.");
        }
    }
}
/*
một người gửi tiết kiệm a đồng với lãi suất s% một tháng ( tính lãi hàng tháng).
 Viết một chương trình tính và in ra màn hình hai cột song song, cột thứ nhất là số tháng đã gửi,
  cột thứ 2 tổng số tiền (cẩ vốn và lãi)
 ứng với số tháng ở cột thứ nhất cho 1 khoảng thời gian từ 1 đến t tháng, với a,s,t được nhập từ bàn phím
 */
