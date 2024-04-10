import java.util.*;

class FindIndexLeftSumRightSumEqual {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = -1;
        for (int i = 0; i < n; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += arr[j];
            }
            for (int k = i + 1; k < n; k++) {
                right += arr[k];
            }
            if (left == right) {
                result = i;
                break;
            }
        }
        System.out.println("The final index is: " + result);
        sc.close();
    }
}
