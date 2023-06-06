package BAI_TAP_CHUONG_2.BAI_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số tiền phải trả: ");
            double tienPhaiTra = scanner.nextDouble();
            double khuyenMai = 0.0;

            if (tienPhaiTra > 200 && tienPhaiTra < 300) {
                khuyenMai = tienPhaiTra * 0.2;
            } else if (tienPhaiTra >= 300) {
                khuyenMai = tienPhaiTra * 0.3;
            }

            System.out.println("Số tiền khuyến mại là: " + khuyenMai);
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại số tiền.");
        }
    }
}
/*
viết chương trình nhập vào xố tiền phải trả cho khách hàng. in ra số tiền khuyễn mại với quy định:\
 nếu số tiền phải trả thuộc (200,300) thì khuyến mại 20%.
nếu số tiền phải trả từ 300 trở lên thì khuyến mại 30%. Còn lại thì không khuyến mại
 */
