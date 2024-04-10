import java.util.*;

class Find_The_Series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term what you want to calculate: ");
        int n = sc.nextInt();
        int result = 0;
        if (n % 2 == 0) {
            result = (int) Math.pow(3, (n - 1) / 2);
        } else {
            result = (int) Math.pow(2, (n - 1) / 2);
        }
        System.out.println("The nth series is: " + result);
        sc.close();
    }
}
