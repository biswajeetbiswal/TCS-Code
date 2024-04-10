import java.util.*;

class Chech_UniqueCharacterInString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        boolean b = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                b = false;
                break;
            }
        }
        System.out.println(b);
        sc.close();
    }
}
