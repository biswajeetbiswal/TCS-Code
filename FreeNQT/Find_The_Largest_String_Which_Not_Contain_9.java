import java.util.*;

class Find_The_Largest_String_Which_Not_Contain_9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string:");
        System.out.println("ENter the String:");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String s2 = "";
        for (String s1 : arr) {
            if (Character.isAlphabetic(s1.charAt(0))) {
                continue;
            } else if (s1.contains("9")) {
                continue;
            } else {
                if (s2.length() < s1.length()) {
                    s2 = s1;
                }
            }
        }
        System.out.println("Final longest string which not contain 9 is: " + s2);
        sc.close();

    }

}