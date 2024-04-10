import java.util.*;

class SortElementAsPerRank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        Arrays.sort(result);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(result[i])) {
                map.put(result[i], rank++);
            }
        }

        for (int i = 0; i < n; i++) {
            result[i] = map.get(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
