import java.util.*;

class Perfect_Square_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check perfect square or not:");
        int n = sc.nextInt();
        if (Math.floor(Math.sqrt(n)) == Math.ceil(Math.sqrt(n))) {
            System.out.println("Is a Perfect number");
        } else {
            System.out.println("Is not a perfect number");
        }
        sc.close();
    }
}
