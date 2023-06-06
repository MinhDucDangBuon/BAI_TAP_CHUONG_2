package BAI_TAP_CHUONG_2.BAI_34;

public class Main {
}

/*
Viết chương trình có chứa các đoạn mã hoặc yêu cầu giải thích kết quả
a) int very_big = 2000000000 + 2000000000;
      System.out.println(very_big);
b) Sử dụng thư viện java.lang.Math gọi hàm sqrt(-1)
c)Chạy chương trình sau và nhận xét kết quả
class Cast{
    public static void main(String[] args) {
        double x = 3.14159;
        int x1 = (int) x;
        System.out.println(x1);
    }
}

 */

/**

 * @param a) Kết quả của đoạn mã này là -294967296. Điều này xảy ra vì khi thực hiện phép tính 2000000000 + 2000000000, kết quả vượt quá giới hạn của kiểu dữ liệu int, dẫn đến tràn số và quay vòng trở lại giá trị âm.

 * @param b) Khi sử dụng java.lang.Math.sqrt(-1), kết quả sẽ là NaN (Not a Number). Điều này xảy ra vì căn bậc hai của một số âm không tồn tại trong tập hợp số thực. Do đó, hàm sqrt(-1) trả về giá trị đặc biệt NaN để biểu thị rằng kết quả không hợp lệ.

 * @param c) Kết quả chương trình sẽ in ra màn hình là 3. Điều này xảy ra vì trong chương trình, biến x có kiểu dữ liệu double với giá trị 3.14159. Sau đó, ta ép kiểu biến x về kiểu int bằng cách sử dụng toán tử ép kiểu (int). Quá trình ép kiểu này sẽ cắt đi phần thập phân và giữ lại phần nguyên của số. Vì vậy, giá trị x1 sau khi ép kiểu sẽ là 3, và chương trình in ra giá trị 3.
 **/


