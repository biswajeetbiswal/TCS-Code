import java.util.*;

class IMP_Pattern1 {

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPerfectSquare(int n) {
        if (Math.ceil((double) Math.sqrt(n)) == Math.floor((double) Math.sqrt(n))) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence number:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int prime = 0, perfect = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i + 1)) {
                arr[i] = (int) Math.pow(2, prime++);
            } else if (isPerfectSquare(i + 1)) {
                arr[i] = (int) Math.pow(3, perfect++);
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        System.out.println("The " + n + "th position of element is: " + arr[arr.length - 1]);
        sc.close();
    }

}
