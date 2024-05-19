import java.util.*;

class Sort_Elements_Of_AnArray_Using_Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], ++count);
            } else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            return map.get(a) - map.get(b);
        });
        int k = 0;
        for (int num : list) {
            for (int i = 0; i < map.get(num); i++) {
                arr[k++] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}