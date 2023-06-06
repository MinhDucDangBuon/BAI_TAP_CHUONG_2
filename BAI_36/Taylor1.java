package BAI_TAP_CHUONG_2.BAI_36;

public class Taylor1 {
    public static void main(String[] args) {
        double x = 1.5; // Giá trị x
        int n = 2; // Số lượng số hạng

        // Tính giá trị các biểu thức
        double expValue = exp(x, n);
        double sinhxValue = sinhx(x, n);
        double sinxValue = sinx(x, n);

        // So sánh kết quả với các hàm có sẵn trong lớp Math
        System.out.println("exp(x) = " + expValue + ", Math.exp(x) = " + Math.exp(x));
        System.out.println("sinh(x) = " + sinhxValue + ", Math.sinh(x) = " + Math.sinh(x));
        System.out.println("sin(x) = " + sinxValue + ", Math.sin(x) = " + Math.sin(x));
    }

    public static double exp(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int k = 1; k <= n; k++) {
            term *= x / k;
            result += term;
        }

        return result;
    }

    public static double sinhx(double x, int n) {
        double result = x;
        double term = x;

        for (int k = 1; k <= n; k++) {
            term *= (x * x) / ((2 * k) * (2 * k + 1));
            result += term;
        }

        return result;
    }

    public static double sinx(double x, int n) {
        double result = x;
        double term = x;

        for (int k = 1; k <= n; k++) {
            term *= (-1) * (x * x) / ((2 * k) * (2 * k + 1));
            result += term;
        }

        return result;
    }
}

/*
Nhập số thực x và số nguyên n từ bàn phím ( n >= 0 ) . Hãy thực hiện tính giá trị của các biểu thức dưới sau đây :
e^x = nΣk=0 (x^k / k! ) = 1 + x + (x^2 )/ (2!) + ... + (x^n) / (n!) , ∀x (1)
sinh(x) = nΣk=0 (x^2k+1)/(2k + 1)! = x + (x^3)/(3!) +  (x^5)/(5!) + ... + (x^2n+1)/(2n + 1)! , ∀x (2)
sin(x) = nΣk=0 ((-1)(x^2k+1))/(2k + 1)! = x - (x^3)/(3!) +  (x^5)/(5!) - ... + ((-1)(x^2n+1))/(2n + 1)! , ∀x (3)
Tạo tệp tin Taylor1.java có chứa các hàm sau :
+ double exp(double x, int n) : thực hiện tính giá trị của hàm mũ ex với đối số x và số lượng số hạng được tính là n theo biểu thức (1)
+ double sinhx(double x, int n) : thực hiện tính giá trị của hàm sinh với đối số x và số lượng số hạng được tính là n theo biểu thức (2)
+ double sinx(double x, int n) : thực hiện tính giá trị của hàm sin với đối số x và số lượng số hạng được tính là n theo biểu thức (3)
Sau khi tính toán, so sánh kết quả các hàm trên với các hàm có sẵn trong hệ thống (lớp Math)
 */