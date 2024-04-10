import java.util.*;

class Find_PrimeNumber_Within_Range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the first number:");
        int first = sc.nextInt();
        System.out.println("ENter the second number:");
        int second = sc.nextInt();
        for (int i = first; i <= second; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}