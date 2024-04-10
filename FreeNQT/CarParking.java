import java.util.*;

class CarParking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int R = sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int C = sc.nextInt();
        int arr[][] = new int[R][C];
        System.out.println("Enter the parking area value:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0, row = 0;
        for (int i = 0; i < R; i++) {
            int count = 0;
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                row = i;
            }
        }
        System.out.println("The maximum no. of vehicle present in the row is:" + (row + 1));
        sc.close();
    }
}
