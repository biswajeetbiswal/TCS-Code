import java.util.*;

class AquaCollextion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the label size:");
        int l = sc.nextInt();

        // int result = 0;
        // for (int i = 0; i < s.length(); i = i + l) {
        // int length = (i + l > s.length()) ? s.length() : i + l;
        // String str = s.substring(i, length);
        // int count = 0;
        // for (int j = 0; j < str.length(); j++) {
        // if (str.charAt(j) == 'a') {
        // count++;
        // }
        // }
        // if (count > result) {
        // result = count;
        // }
        // }
        // System.out.println("Maximum label of aqua:" + result);

        // Another approach

        int max = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % l == 0) {
                max = Math.max(max, count);
                count = 0;
            }
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        max = Math.max(max, count);
        System.out.println("Maximum posibilities:" + max);
        sc.close();
    }
}
