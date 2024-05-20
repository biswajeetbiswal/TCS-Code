import java.util.*;

class Head_Legs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no. of animals:");
        int N = sc.nextInt();
        System.out.println("Enter the no. of Legs:");
        int L = sc.nextInt();
        int i;
        for (i = 1; i <= N; i++) {
            if ((i * 2 + (N - i) * 4) == L) {
                break;
            }
        }
        System.out.println("Total no. of 2 legs animal " + i + " Total no. of 4 legs animal " + (N - i));
        sc.close();
    }
}
