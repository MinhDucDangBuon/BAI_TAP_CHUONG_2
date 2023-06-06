package BAI_TAP_CHUONG_2.BAI_39;

import java.util.Scanner;

public class TaylorApproximation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị x: ");
        double x = scanner.nextDouble();

        System.out.print("Nhập giá trị epsilon: ");
        double epsilon = scanner.nextDouble();

        double coshResult = cosh(x, epsilon);
        double cosResult = cos(x, epsilon);

        System.out.println("Giá trị của cosh(" + x + ") là: " + coshResult);
        System.out.println("Giá trị của cos(" + x + ") là: " + cosResult);
    }

    public static double cosh(double x, double epsilon) {
        double sum = 1.0;
        double term = 1.0;
        int n = 1;

        while (Math.abs(term) >= epsilon) {
            term *= (x * x) / (2 * n * (2 * n - 1));
            sum += term;
            n++;
        }

        return sum;
    }

    public static double cos(double x, double epsilon) {
        double sum = 1.0;
        double term = 1.0;
        int n = 1;

        while (Math.abs(term) >= epsilon) {
            term *= -1 * (x * x) / (2 * n * (2 * n - 1));
            sum += term;
            n++;
        }

        return sum;
    }
}

/*
Nhập 2 số thực x và epsilon từ bàn phím ( epsilon 1 ). Tính giá trị của các biểu thức sau :
cosh(x) = Σn=0 (x^2n / (2n)!) = 1 + (x^2/(2!)) + (x^4/(4!)) + ... + (x^2n/(2n)!)) , ∀x (4)
cos(x) =  Σn=0 ( ( ( -1 )^n ) * x^2n /(( 2n )!) ) = 1 - (x^2/(2!)) + (x^4/(4!)) - ... +   ((( -1 )^n ) * x^2n /(( 2n )!) ), ∀x (5)
Tạo tệp tin Taylor2 có chứa hai hàm sau :
- double cosh(double x, double epsilon)
Tính giá trị hàm cosh với đối số x và có sai số là epsilon theo công thức  (4)
- double cos (double x, double epsilon )
Tính giá trị hàm cos với đối số x và có sai số là epsilon theo công thức (5)
 */