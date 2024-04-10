import java.util.*;

class CipherText {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cipher text: ");
        String s = sc.nextLine();
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch + key > 122) {
                    char ch1 = (char) (ch + key - 26);
                    str += Character.toString((ch1));
                } else {
                    str += Character.toString(ch + key);
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch + key > 90) {
                    char ch1 = (char) (ch + key - 26);
                    str += Character.toString((ch1));
                } else {
                    str += Character.toString(ch + key);
                }
            } else {
                int n = ch - '0';
                if (n + key > 9) {
                    str += (n + key - 10);
                } else {
                    str += (n + key);
                }
            }
        }

        System.out.println("The final text is after encryption: " + str);
        sc.close();
    }
}
