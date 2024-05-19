import java.util.*;

class Unique_Characters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (!list.contains(ch)) {
                list.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
