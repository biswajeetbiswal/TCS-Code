import java.util.*;
import java.math.BigInteger;

class NumberOfHandshakes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people present in the meeting:");
        int n = sc.nextInt();
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        int x = n - 2;
        BigInteger res2 = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            res2 = res2.multiply(BigInteger.valueOf(i));
        }
        res2 = res2.multiply(BigInteger.valueOf(2));
        System.out.println("Total no. of handshakes is: " + res.divide(res2));
        sc.close();
    }
}
