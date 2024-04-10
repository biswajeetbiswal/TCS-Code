import java.math.BigInteger;
import java.util.*;

class Strong_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while (n > 0) {
            int rem = n % 10;
            BigInteger res = BigInteger.ONE;
            for (int i = 2; i <= rem; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }
            n /= 10;
            sum += res.intValue();
        }
        if (sum == temp) {
            System.out.println("Is a Strong number");
        } else {
            System.out.println("Is not a Strong number");
        }
        sc.close();
    }
}
