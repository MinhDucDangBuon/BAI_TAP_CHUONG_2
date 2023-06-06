package BAI_TAP_CHUONG_2.BAI_11;

import java.util.Scanner;

public class Main {
    private static final String[] UNITS = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    private static final String[] TEN_TO_NINETEEN = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
    private static final String[] TENS = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
    private static final String[] POWERS = {"", "nghìn", "triệu", "tỷ"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên (<= 9999): ");
        int number = scanner.nextInt();

        if (number > 9999) {
            System.out.println("Số nguyên quá lớn. Vui lòng nhập số nhỏ hơn hoặc bằng 9999.");
        } else {
            String readNumber = readNumber(number);
            System.out.println("Cách đọc số nguyên " + number + " là: " + readNumber);
        }
    }

    public static String readNumber(int number) {
        if (number == 0) {
            return "không";
        }

        String result = "";
        int power = 0;

        while (number > 0) {
            int group = number % 1000;
            if (group != 0) {
                String groupString = readGroup(group);
                result = groupString + " " + POWERS[power] + " " + result;
            }
            number /= 1000;
            power++;
        }

        return result.trim();
    }

    public static String readGroup(int number) {
        String result = "";

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int unit = number % 10;

        if (hundred > 0) {
            result += UNITS[hundred] + " trăm";
        }

        if (ten > 1) {
            result += " " + TENS[ten];
            if (unit > 0) {
                result += " " + UNITS[unit];
            }
        } else if (ten == 1) {
            if (unit == 0) {
                result += " mười";
            } else {
                result += " " + TEN_TO_NINETEEN[unit];
            }
        } else if (unit > 0) {
            result += " linh " + UNITS[unit];
        }

        return result.trim();
    }
}

/*
nhập một số nguyên <= 9999, in ra màn hình cách đọc số nguyên đó (VD: số 1523 đọc là 1 ngàn 5 trăm 2 chục 3 đơn vị).
Nhận xét về cách làm vừa áp dụng nếu số nguyên nhập vòa không được giới hạn?
 Thử đưa ra Phương án đọc số hoàn toàn? (VD: với số 1304 đọc là: một nghìn ba tram linh tư)
 */

