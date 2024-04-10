import java.util.*;

class Finding_The_Missing_Element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the no. of elements in the second array:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the first array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the second array elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        System.out.println("The missing element is: " + (sum1 - sum2));
        sc.close();
    }
}
