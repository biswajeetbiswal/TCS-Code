import java.util.*;

class CountVowelConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowel = 0, consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        System.out.println("Total number of vowel is: " + vowel + " Toal nimber of consonant is: " + consonant);
        sc.close();
    }
}