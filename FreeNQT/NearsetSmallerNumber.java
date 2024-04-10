import java.util.*;

class NearsetSmallerNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int output[] = new int[n];
        output[0] = -1;
        int lowest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                output[i] = arr[i - 1];
                if (lowest > arr[i - 1]) {
                    lowest = arr[i - 1];
                }
            } else {
                if (lowest > arr[i]) {
                    output[i] = -1;
                    lowest = arr[i];
                } else {
                    output[i] = lowest;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
        sc.close();
    }
}