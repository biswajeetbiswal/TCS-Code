import java.util.*;

class SecondLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (largest != arr[i]) {
                System.out.println("Second largest element is: " + arr[i]);
                break;
            }
        }
        sc.close();
    }
}
