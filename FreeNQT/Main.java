
public class Main {

    // Function to calculate HCF (GCD) of two numbers using Euclidean algorithm
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM of two numbers using the formula: LCM(a, b) = (a *
    // b) / HCF(a, b)
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateHCF(a, b);
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
