import java.math.BigInteger;
import java.util.*;

class CircularTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of guest:");
        int n = sc.nextInt();
        // long result = 1;
        // for (int i = 1; i < n; i++) {
        // result *= i;
        // }
        // result = result * 2;
        // System.out.println(result);
        System.out.println(fact(n));
        sc.close();
    }

    public static BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i < n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res.multiply(BigInteger.valueOf(2));
    }
}
