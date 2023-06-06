package BAI_TAP_CHUONG_2.BAI_37;

import java.util.HashMap;
import java.util.Map;

class Collatz {
    private static Map<Long, Integer> collatzLengthMap = new HashMap<>();

    public static void main(String[] args) {
        int n = 13;

        System.out.println("Length of Collatz sequence starting from " + n + ": " + getLengthOfCollatzSequence(n));
        System.out.print("Collatz sequence starting from " + n + ": ");
        generateCollatzSequence(n);

        int upper = 10;
        System.out.println("First number with longest Collatz sequence (up to " + upper + "): " + getGenerateNumberOfLongestCollatzSequence(upper));

        upper = 1000;
        System.out.println("First number with longest Collatz sequence (up to " + upper + "): " + getGenerateNumberOfLongestCollatzSequence(upper));

        upper = 10000;
        System.out.println("First number with longest Collatz sequence (up to " + upper + "): " + getGenerateNumberOfLongestCollatzSequence(upper));

        upper = 115000;
        System.out.println("First number with longest Collatz sequence (up to " + upper + "): " + getGenerateNumberOfLongestCollatzSequence(upper));

        upper = 100000000;
        System.out.println("First number with longest Collatz sequence (up to " + upper + "): " + getGenerateNumberOfLongestCollatzSequence(upper));
    }

    public static int next(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static int getLengthOfCollatzSequence(int n) {
        int length = 1;

        while (n != 1) {
            n = next(n);
            length++;
        }

        return length;
    }

    public static void generateCollatzSequence(int n) {
        System.out.print(n + " ");

        while (n != 1) {
            n = next(n);
            System.out.print(n + " ");
        }

        System.out.println();
    }

    public static int getGenerateNumberOfLongestCollatzSequence(long upper) {
        int maxLength = 0;
        int number = 0;

        for (long i = 1; i <= upper; i++) {
            int length = getLengthOfCollatzSequence(i);

            if (length > maxLength) {
                maxLength = length;
                number = (int) i;
            }
        }

        return number;
    }

    public static int getLengthOfCollatzSequence(long n) {
        if (collatzLengthMap.containsKey(n)) {
            return collatzLengthMap.get(n);
        }

        int length = 1;
        long nextNumber = n;

        while (nextNumber != 1) {
            if (nextNumber % 2 == 0) {
                nextNumber /= 2;
            } else {
                nextNumber = 3 * nextNumber + 1;
            }

            if (collatzLengthMap.containsKey(nextNumber)) {
                length += collatzLengthMap.get(nextNumber);
                break;
            }

            length++;
        }

        collatzLengthMap.put(n, length);
        return length;
    }
}

public class Main {
    public static void main(String[] args) {
        Collatz.main(null);
    }
}

/*
Chuỗi Collatz là một chuỗi số tự nhiên, trong đó số đứng liền sau được xác định theo số đứng liền trước và dừng lại khi gặp phần tử 1. Công thức truy hồi ( công thức này bạn tự biết nhé )
Phần tử đầu tiên của chuỗi Collatz được gọi là phần tử sinh. Ví dụ nếu phần tử sinh là n = 13 thì chuỗi Collatz có độ dài là 10 : 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
Có giả thiết ( chưa được chứng minh hay bác bỏ ) là mỗi chuỗi Collatz luôn kết thúc sau hữu hạn bước và bằng 1 . Giả thiết Collatz đã được kiểm chứng đúng đến n = 2^60
Cài đặt 1 chương trình đặt tên là Collatz và thực hiện các yêu cầu sau.
a) Cài đặt hàm int next(int n) có đầu vào là số tự nhiên n và đầu ra là số tiếp theo trong chuỗi Collatz
b) Cài đặt hàm int getLengthOfCollatzSequence ( int n ) trả về độ dài chuỗi Collatz bắt đầu bởi số tự nhiên n
c) Cài đặt hàm void generateCollatzSequence(int n ) in ra chuỗi Collatz bắt đầu bằng số tự nhiên n và kết thúc bằng 1.
d) Cài đặt hàm getGenerateNumberOfLongestCollatzSequence ( int uppper) trả về số tự nhiên đầu tiên sinh ra chuỗi Collatz dài nhất mà không vượt quá upper
Chạy thử hàm voiiws upper lần lượt nhận giá trị là 10, 1000,10000
e) Thực hiện yêu cầu như câu d) nhưng upper = 115 000
f) Thực hiện yêu cầu như câu d nhưng với upper = 100  000 000
 */