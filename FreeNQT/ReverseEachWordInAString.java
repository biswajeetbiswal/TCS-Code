import java.util.*;

class ReverseEachWordInAString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String s2 = "";
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            s2 += sb.toString();
            if (i != arr.length - 1) {
                s2 += " ";
            }
        }
        System.out.println("After reverse of each word:" + s2 + " " + s2.length());
        sc.close();
    }
}
