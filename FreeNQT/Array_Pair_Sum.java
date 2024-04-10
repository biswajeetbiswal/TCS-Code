import java.util.*;

class Array_Pair_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    list1.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        for (List<Integer> list2 : list1) {
            System.out.print("[");
            for (int num : list2) {
                System.out.print(num + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        sc.close();
    }
}