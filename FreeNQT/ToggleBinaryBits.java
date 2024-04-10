import java.util.*;

class ToggleBinaryBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer:");
        int n = sc.nextInt();
        // int dec = 0;
        // int i = 0;
        // while (n != 0) {
        // int x = n % 2;
        // dec = dec + (int) Math.pow(10, i++) * x;
        // n = n / 2;
        // }
        // int toggle = 0;
        // i = 0;
        // while (dec != 0) {
        // int y = dec % 10;
        // if (y == 0) {
        // toggle = toggle + (int) Math.pow(10, i++) * 1;
        // } else {
        // toggle = toggle + (int) Math.pow(10, i++) * 0;
        // }
        // dec = dec / 10;
        // }
        // int result = 0;
        // i = 0;
        // while (toggle != 0) {
        // int z = toggle % 10;
        // result += Math.pow(2, i++) * z;
        // toggle = toggle / 10;
        // }

        // System.out.println("The final result is: " + result);
        // other Approach
        String s = Integer.toBinaryString(n);
        String s1 = "";
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                s1 += '1';
            } else {
                s1 += '0';
            }
        }
        int output = Integer.parseInt(s1, 2);
        System.out.println("Output is: " + output);
        sc.close();
    }
}
