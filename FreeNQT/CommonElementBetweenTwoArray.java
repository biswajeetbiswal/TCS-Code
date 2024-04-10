import java.util.*;

class CommonElementBetweenTwoArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in first array:");
        int first = sc.nextInt();
        System.out.println("Enter the number of element in second array: ");
        int second = sc.nextInt();
        int arr1[] = new int[first];
        int arr2[] = new int[second];
        System.out.println("Enter the first array elements:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the second array elements:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}
