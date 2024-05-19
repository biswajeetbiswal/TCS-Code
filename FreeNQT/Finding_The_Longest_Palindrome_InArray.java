import java.util.*;

class Finding_The_Longest_Palindrome_InArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String result = "";
        for (int num : arr) {
            String s = Integer.toString(num);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            if (s.equals(sb.toString())) {
                if (result.length() < s.length()) {
                    result = s;
                }
            }
        }
        System.out.println("Longest Palindrome is: " + (Integer.parseInt(result)));
        sc.close();
    }
}
