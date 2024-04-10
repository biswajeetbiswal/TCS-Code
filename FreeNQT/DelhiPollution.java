import java.util.*;

class DelhiPollution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of vehicles:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter vehicles last digit registration number:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Date:");
        int d = sc.nextInt();
        System.out.println("Enter the fine amount per user:");
        int fine = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != d % 2) {
                count++;
            }
        }
        System.out.println("Total fine collection is: " + count * fine);
        sc.close();
    }
}
