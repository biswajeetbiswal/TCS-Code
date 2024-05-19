import java.util.*;

class Data_Transmission {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0, first = 0, second = 0;
        for (int i = 0; i < arr.length; i++) {
            int count1 = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                // System.out.println("ju" + arr[i]);
                count++;
                if (first < arr[i]) {
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second) {
                    second = arr[i];
                }
            }
        }
        System.out.println(count + second);
        sc.close();
    }
}
