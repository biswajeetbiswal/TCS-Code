import java.util.*;

class Character_At_Odd_Position {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        for (int i = 1; i < s.length(); i = i + 2) {
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}