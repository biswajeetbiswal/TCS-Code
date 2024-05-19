import java.util.*;

class PerfectSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number to check perfect aquare or not:");
        int n = sc.nextInt();
        boolean b = false;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) {
                b = true;
                break;
            }
        }
        if (b == false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        sc.close();
    }
}
