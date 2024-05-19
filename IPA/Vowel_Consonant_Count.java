import java.util.*;

class Vowel_Consonant_Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z]", "");
        s = s.toLowerCase();
        int vowel = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }
        System.out.println("Vowel count- " + vowel);
        System.out.println("Consonant count- " + (s.length() - vowel));
        sc.close();
    }
}
