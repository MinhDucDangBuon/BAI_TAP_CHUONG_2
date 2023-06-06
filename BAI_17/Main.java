package BAI_TAP_CHUONG_2.BAI_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm tổng kết: ");
        double diemTongKet = scanner.nextDouble();

        String xepLoai;

        if (diemTongKet >= 8.00 && diemTongKet <= 10.00) {
            xepLoai = "Giỏi";
        } else if (diemTongKet >= 7.00 && diemTongKet < 8.50) {
            xepLoai = "Khá";
        } else if (diemTongKet >= 5.00 && diemTongKet < 7.00) {
            xepLoai = "Trung bình";
        } else if (diemTongKet >= 0.00 && diemTongKet < 5.00) {
            xepLoai = "Yếu";
        } else {
            xepLoai = "Không xếp loại";
        }


        System.out.println("Xếp loại: " + xepLoai);
    }
}
//viết chương trình nhập vào điểm tổng kết của 1 học sinh và in ra xếp loại cho học sinh đó với quy định -xếp loại giỏi nếu tổng điểm từ 8.00  tới cận 10.00. -xếp loại khá nếu tổng điểm từ 7.00 tới cận 8.00. -xếp loại trung bình nếu tổng điểm từ 5.00 tới cận 7.00. -còn lại xếp loại yếu//