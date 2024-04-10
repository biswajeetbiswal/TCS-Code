import java.util.*;

class SumResult {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        System.out.println("Enter the value of R:");
        int R = sc.nextInt();
        int sum = 0;
        while (N > 0) {
            sum = sum + (N % 10);
            N = N / 10;
        }
        sum = sum * R;
        int result = 0;
        while (sum > 0) {
            result = result + (sum % 10);
            sum = sum / 10;
        }
        System.out.println("Final sum is:" + result);
        sc.close();
    }
}
