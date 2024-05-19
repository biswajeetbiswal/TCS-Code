import java.util.*;

class Last_Char_Every_Word {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        s = s.replaceAll("\s+", " ");
        String arr[] = s.split(" ");
        String result = "";
        for (String res : arr) {
            if (!Character.isDigit(res.charAt(res.length() - 1))) {
                result += res.charAt(res.length() - 1);
            }
        }
        System.out.println(result);
        sc.close();
    }
}