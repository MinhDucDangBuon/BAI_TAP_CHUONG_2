package BAI_TAP_CHUONG_2.BAI_31;

public class SquareRootCalculator {
    public static void main(String[] args) {
        double a = 25.0; // Số dương cần tính căn bậc 2
        double epsilon = 0.00001; // Độ chính xác

        double sqrtA = calculateSquareRoot(a, epsilon);
        System.out.println("Căn bậc 2 của " + a + " là " + sqrtA);
    }

    public static double calculateSquareRoot(double a, double epsilon) {
        double xn = a; // Giá trị ban đầu
        double xnPlus1 = (xn * xn + a) / (2 * xn); // Cập nhật giá trị ban đầu

        while (Math.abs((xnPlus1 - xn) / xn) >= epsilon) {
            xn = xnPlus1;
            xnPlus1 = (xn * xn + a) / (2 * xn);
        }

        return xnPlus1;
    }
}

/*
Dùng công thức sau
x(0) = a;
x(n+1) = (x(n) * x(n) + a) / ( 2 * x(n)) với n >= 0
Quá trình lặp kết thúc khi abs((x(n+1) - x(n))/x(n)) < ε. và khi đó x(n+1) được xem là giá trị gần đúng của sqrt(a).
Viết chương trình tính căn bậc 2 của a với độ chính xác ε = 0.00001
 */