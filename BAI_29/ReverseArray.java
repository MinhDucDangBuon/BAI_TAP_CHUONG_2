package BAI_TAP_CHUONG_2.BAI_29;

public class ReverseArray {
    public static void main(String[] args) {
        double[] x = {12.3, -45.4, 12, 15, 10.1, 12.5};

        int start = 0;
        int end = x.length - 1;

        while (start < end) {
            double temp = x[start];
            x[start] = x[end];
            x[end] = temp;
            start++;
            end--;
        }

        System.out.println("Dãy số sau khi đảo ngược:");
        for (double num : x) {
            System.out.print(num + " ");
        }
    }
}

/*
Cho dãy số x[] = { 12.3 , -45.4 , 12 , 15, 10.1 , 12.5 }. Viết chương trình đảo ngược dãy số trên.
Đánh giá độ phức tạp của giải thuaajt đảo ngược dãy số bất kỳ có n phần tử trong trường hợp tồi nhất ?
 */

/*
Về độ phức tạp của giải thuật đảo ngược dãy số có n phần tử trong trường hợp tồi nhất, nó là O(n/2),
nhưng với các giá trị lớn, ta có thể xấp xỉ nó là O(n).
Điều này bởi vì vòng lặp chỉ chạy qua n/2 phần tử để hoán đổi giá trị.
 */