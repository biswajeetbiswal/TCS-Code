import java.util.*;

class Perfect_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check perfect number or not:");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == temp) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not perfect number");
        }
        sc.close();
    }
}
