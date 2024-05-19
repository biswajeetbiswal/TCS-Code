import java.util.*;

class Unions_Intersection_OfAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element in the first string:");
        int n1 = sc.nextInt();
        System.out.println("Enter the no. of element in the second string:");
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            if (!list.contains(arr1[i])) {
                list.add(arr1[i]);
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            if (!list.contains(arr2[i])) {
                list.add(arr2[i]);
            } else {
                list2.add(arr2[i]);
            }
        }
        System.out.println("After the union operation the elements are:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.err.println();
        System.out.println("After the intersection operation the elements are:");
        for (int num : list2) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
