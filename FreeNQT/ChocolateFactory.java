import java.util.*;

class ChocolateFactory {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of chocolate jar:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the chocolates:");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int cholo[] = new int[n];
        // int j = 0;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] != 0) {
        // cholo[j++] = arr[i];
        // }
        // }

        // for (int i = 0; i < cholo.length; i++) {
        // System.out.print(cholo[i] + " ");
        // }

        // other approach
        int k = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x != 0) {
                arr[k++] = x;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}