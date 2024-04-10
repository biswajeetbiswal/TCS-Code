import java.util.*;

class SubArrayContineous {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                ArrayList<Integer> list1 = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    list1.add(arr[k]);
                }
                list.add(list1);
            }
        }

        for (List<Integer> list2 : list) {
            for (int num : list2) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}