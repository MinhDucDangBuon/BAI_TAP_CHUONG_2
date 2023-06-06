package BAI_TAP_CHUONG_2.BAI_26;

import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số nguyên dương m: ");
        int m = scanner.nextInt();

        int sum = 0;
        int positiveEvenSum = 0;
        int negativeEvenSum = 0;
        int positiveOddSum = 0;
        int negativeOddSum = 0;

        System.out.print("Chọn cách tính (1 - for, 2 - while): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = -n; i <= m; i++) {
                    sum += i;

                    if (i > 0 && i % 2 == 0) {
                        positiveEvenSum += i;
                    } else if (i < 0 && i % 2 == 0) {
                        negativeEvenSum += i;
                    } else if (i > 0 && i % 2 != 0) {
                        positiveOddSum += i;
                    } else if (i < 0 && i % 2 != 0) {
                        negativeOddSum += i;
                    }
                }
                break;
            case 2:
                int i = -n;
                while (i <= m) {
                    sum += i;

                    if (i > 0 && i % 2 == 0) {
                        positiveEvenSum += i;
                    } else if (i < 0 && i % 2 == 0) {
                        negativeEvenSum += i;
                    } else if (i > 0 && i % 2 != 0) {
                        positiveOddSum += i;
                    } else if (i < 0 && i % 2 != 0) {
                        negativeOddSum += i;
                    }

                    i++;
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                scanner.close();
                return;
        }

        System.out.println("Tổng các số trong khoảng [-" + n + ", " + m + "]: " + sum);
        System.out.println("Tổng các số chẵn dương trong khoảng [-" + n + ", " + m + "]: " + positiveEvenSum);
        System.out.println("Tổng các số chẵn âm trong khoảng [-" + n + ", " + m + "]: " + negativeEvenSum);
        System.out.println("Tổng các số lẻ dương trong khoảng [-" + n + ", " + m + "]: " + positiveOddSum);
        System.out.println("Tổng các số lẻ âm trong khoảng [-" + n + ", " + m + "]: " + negativeOddSum);

        scanner.close();
    }
}

/*
Viết chương trình nhập vào các số nguyên dương n,m sau đó in ra :
Tổng các số, chẵn dương, chẵn âm, lẻ dương , lẻ âm trong khoảng [ -n,m]
Hãy thực hiện chương trình bằng 2 cắch và đánh giá mỗi cách
 */

/**
Đánh giá:
 * @Param_Cách_1 : sử dụng vòng lặp for có thể dễ dàng kiểm soát và quản lý biến đếm i trong phạm vi từ -n đến m.
 Cách này có cấu trúc rõ ràng và dễ đọc.

 * @Param_Cách 2 sử dụng vòng lặp while cũng cho phép kiểm soát biến đếm i, tuy nhiên, cần phải cẩn thận đảm bảo rằng biến
 đếm được tăng dần đúng cách và không bị lặp vô hạn. Cách này có cấu trúc linh hoạt hơn và có thể phù hợp với một số tình huống lặp
khác.

Độ phức tạp của cả hai cách là O(m + n), trong đó m là giá trị của biến m và n là giá trị của biến n.
 */