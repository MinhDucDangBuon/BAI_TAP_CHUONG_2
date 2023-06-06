package BAI_TAP_CHUONG_2.BAI_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền phải trả: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Số tiền phải trả không hợp lệ.");
            return; // Kết thúc chương trình sau khi in thông báo
        }

        double discount = 0.0;

        if (amount > 200 && amount < 300) {
            discount = amount * 0.2;
        } else if (amount >= 300) {
            discount = amount * 0.3;
        }

        System.out.println("Số tiền khuyến mại: " + discount);
    }
}

//viết chương trình nhập vào số tiền phải trả của khách hàng.
// In ra số tiền khuyến mại với quy định: nếu số tiền phải trả thuộc (200,300) thì khuyến mại 20%.
// Nếu số tiền phải trả từ 300 trở lên thì khuyến mại 30%. Còn lại thì không khuyến mại
