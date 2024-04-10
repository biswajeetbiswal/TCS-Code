import java.util.*;

class Sort_First_Half_Ascending_And_Second__Half_Descending {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements present in an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int j = 0; j < n / 2; j++) {
            for (int i = n / 2; i < n - j - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}