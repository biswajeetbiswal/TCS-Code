import java.util.*;

class Convert_SeventeenthToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        map.put('G', 16);
        int k = 0, sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += ((int) Math.pow(17, k++)) * map.get(s.charAt(i));
        }
        System.out.println("Decimal format of " + s + " is " + sum);
        sc.close();
    }
}
