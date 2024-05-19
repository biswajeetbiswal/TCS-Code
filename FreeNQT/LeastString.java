import java.util.*;

class LeastString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            int flag = 1;
            for (int i = 9; i >= 2; i--) {
                if (n % i == 0) {
                    n /= i;
                    sb.append(i);
                    break;
                }
                flag = 0;
            }
            if (flag == 0) {
                sb.append(n);
                break;
            }
        }
        sb.reverse();
        String s = sb.toString();
        System.out.println(s);
        sc.close();
    }
}