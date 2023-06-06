package BAI_TAP_CHUONG_2.BAI_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        int numberOfDays;

        switch (month) {
            case 1: // Tháng 1
            case 3: // Tháng 3
            case 5: // Tháng 5
            case 7: // Tháng 7
            case 8: // Tháng 8
            case 10: // Tháng 10
            case 12: // Tháng 12
                numberOfDays = 31;
                break;
            case 4: // Tháng 4
            case 6: // Tháng 6
            case 9: // Tháng 9
            case 11: // Tháng 11
                numberOfDays = 30;
                break;
            case 2: // Tháng 2
                numberOfDays = 28; // Giả sử là năm không nhuận
                break;
            default:
                numberOfDays = -1; // Giá trị mặc định để xử lý ngoại lệ
                break;
        }

        if (numberOfDays == -1) {
            System.out.println("Tháng không hợp lệ!");
        } else {
            System.out.println("Số ngày trong tháng " + month + ": " + numberOfDays);
        }
    }
}
//viết chương trình nhập vào 1 tháng của 1 năm bất kỳ ( dương lịch), sau đó in ra số ngày có trong tháng //