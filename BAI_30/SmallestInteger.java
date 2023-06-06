package BAI_TAP_CHUONG_2.BAI_30;

public class SmallestInteger {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;

        while (sum <= 1000) {
            sum += n;
            n++;
        }

        System.out.println("Số nguyên dương nhỏ nhất thoả mãn tổng từ 1 đến n > 1000 là: " + n);
    }
}

/*
Viết chương trình tìm số nguyên dương n nhỏ nhất thoả mãn 1 + 2 +3 + ...  + n > 1000
 */