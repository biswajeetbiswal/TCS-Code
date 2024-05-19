import java.util.*;

class Space_Character_Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count how many character and space present in the string:");
        String s = sc.nextLine();
        // String s1 = s;
        // int count = s.length();
        // s = s.replaceAll("\s+", " ");
        // count -= s.length();
        // String arr[] = s.split(" ");
        // count += (arr.length - 1);
        // System.out.println("No of space: " + count + " No of character: " +
        // (s1.length() - count));
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                count++;
            }
        }
        System.out.println("No of charcter is: " + (s.length() - count) + " No of space is: " + count);
        sc.close();
    }
}
