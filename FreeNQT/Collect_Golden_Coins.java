import java.util.*;

class Collect_Golden_Coins {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of room:");
        int n = sc.nextInt();
        System.out.println("Total coins required to search:");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the no. of coins in particular room: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = 0;
                for (int l = i; l < j; l++) {
                    sum += arr[l];
                }
                if (sum == k) {
                    first = Math.min(first, i + 1);
                    second = Math.min(second, j);
                }
            }
        }
        System.out.println("The first room is " + first + " The last room is: " + second);
        sc.close();
    }
}