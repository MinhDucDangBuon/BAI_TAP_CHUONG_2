package BAI_TAP_CHUONG_2.BAI_10;

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
            int count = 0;
            for (int i = 6; i <= t; i += 6) {
                double interest = totalAmount * s / 100 * 6;
                totalAmount += interest;
                count += 6;

                System.out.println(count + "\t\t" + totalAmount);
            }
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại số vốn và lãi suất dưới dạng số.");
        }
    }
}
/*
người gửi tiết kiệm a đồng với lãi suất là s% một tháng trong kỳ hạn 6 tháng (6 tháng tính lãi một lần).
Viết chương trình tính và in ra màn hình hai cột song song, cột thứ nhất là số tháng đã gửi, cột thứ hai là tổng tiền
( cả vốn và lãi) ứng với số tháng ở cột thứ nhất cho một khoảng thời gian từ 6 tháng đến t tháng, với a,s và t được nhập từ bàn phím
(Biết rằng nếu lĩnh không chẵn kỳ nào thì không được tính lãi kỳ ấy)
 */
