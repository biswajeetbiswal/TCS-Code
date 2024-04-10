import java.util.*;

class Array_LeftRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the d no. of rotation:");
        int d = sc.nextInt();

        // First Approach

        // Stack<Integer> stack = new Stack<>();
        // for (int i = d - 1; i >= 0; i--) {
        // stack.push(arr[i]);
        // }
        // for (int i = n - 1; i >= d; i--) {
        // stack.push(arr[i]);
        // }
        // while (stack.empty() == false) {
        // System.out.print(stack.peek());
        // stack.pop();
        // if (stack.empty() == false) {
        // System.out.print(" ");
        // }
        // }

        // Second Approach
        int arr1[] = new int[n];
        int k = 0;
        for (int i = d; i < n; i++) {
            arr1[k++] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr1[k++] = arr[i];
        }
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
