import java.util.*;

class FavoriteSunday {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        String s = sc.nextLine();
        System.out.println("Enter the no of days:");
        int n = sc.nextInt();
        String arr[] = { "mon", "tue", "wed", "thr", "fri", "sat", "sun" };
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                break;
            }
        }
        System.out.println(i);
        int result = 0;
        if (n >= i) {
            result = 1;
        }
        int x = 7 - i;
        n = n - x;
        if (n > 0) {
            result = result + (n / 7);
        }

        System.out.println("Total no. of days he enjoy:" + result);
        sc.close();
    }
}
