import java.util.*;

class RepeatingCharacters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of P:");
        int p = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), ++count);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        char ch = 125;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() >= p) {
                if (e.getKey() < ch) {
                    ch = e.getKey();
                }
            }
        }
        System.out.println("The final character is: " + ch);
        sc.close();
    }
}
