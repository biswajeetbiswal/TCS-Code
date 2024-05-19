import java.util.*;

class Smallest_Vowel_In_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find smallest vowel:");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        char ch = 'z';
        for (char x : arr) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'O' || x == 'I'
                    || x == 'U') {
                if (x < ch) {
                    ch = x;
                }
            }
        }
        if (ch != 'z') {
            System.out.println("Lowest vowel is:" + ch);
        } else {
            System.out.println("There is no vowel in the string.");
        }
        sc.close();
    }
}