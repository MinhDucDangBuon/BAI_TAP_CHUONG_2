package BAI_TAP_CHUONG_2.BAI_28;

public class SmallestPowerOfTwo {
    public static void main(String[] args) {
        int num = 1;

        do {
            num *= 2;
        } while (num <= 1000);

        System.out.println("Số lũy thừa 2 bé nhất lớn hơn 1000 là: " + num);
    }
}



/*
Dùng while ( sau đó viết lại , dùng do/while ) để viết chương trình in ra số là luỹ thừa 2 bé nhất lớn hơn 1000
 */