import java.util.*;

class FindingReapetingAndMissingElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements between 1 to n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        int duplicate = 0, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        for (int num : arr) {
            if (set.contains(num)) {
                duplicate = num;
            } else {
                set.add(num);
                sum -= num;
            }
        }
        System.out.println("The missing value is: " + sum + " The duplicate element is: " + duplicate);
        sc.close();
    }
}
