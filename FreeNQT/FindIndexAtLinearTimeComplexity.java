import java.util.*;

class FindIndexAtLinearTimeComplexity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter matrix element:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element that you want to find:");
        int num = sc.nextInt();
        int row = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] <= num && arr[i][n - 1] >= num) {
                row = i;
                break;
            }
        }
        int col = 0;
        for (int i = 0; i < n; i++) {
            if (arr[row][i] == num) {
                col = i;
                break;
            }
        }
        if (arr[row][col] == num) {
            System.out.println("The element found at {" + row + "," + col + "}");
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
