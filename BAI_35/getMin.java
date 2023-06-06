package BAI_TAP_CHUONG_2.BAI_35;

/*
public static double getMax(double a, double b, double c) {
    double max = a;
    if (max < b) {
        max = b;
    }
    if (max < c) {
        max = c;
    }
    return max;
}
public static double getMax(double a, double b, double c, double d) {
    double max = a;
    if (max < b) {
        max = b;
    }
    if (max < c) {
        max = c;
    }
    if (max < d) {
        max = d;
    }
    return max;
}
public static double getMax(double a, double b, double c) {
    double max = a;
    if (max < b) {
        max = b;
    }
    if (max < c){
        max=c;
        }
    return max;
}
public static double getMax(double a, double b, double c) {
    double max;
    if (a >= b && a >= c) {
        max = a;
    } else if (b >= a && b >= c) {
        max = b;
    } else {
        max = c;
    }
Ứng dụng 1 trong 4 thuật toán trên để cài đặt hàm double getMin(double a, double b, double c, double d )
 tìm giá trị nhỏ nhất trong 4 số a,b,c,d
 */

import java.util.Scanner;

class getMin {
    public static double getMin(double a, double b, double c, double d) {
        double min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a, b, c is the input from user
        double a,b,c;
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        System.out.println("Enter d: ");
        double d = sc.nextDouble();
        System.out.println("Min is: " + getMin(a, b, c, d));
    }
}

