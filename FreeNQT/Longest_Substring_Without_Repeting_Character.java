import java.util.*;

class Longest_Substring_Without_Repeting_Character {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                } else {
                    set.add(s.charAt(j));
                }
            }
            max = Math.max(max, set.size());
        }
        System.out.println("The maximum length is: " + max);
        sc.close();
    }
}