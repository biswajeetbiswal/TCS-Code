import java.util.*;

class StrangeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        boolean b = true;
        for (int num : list) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                b = false;
                break;
            }
        }
        if (b) {
            if (Math.sqrt(n) >= list.get(list.size() - 1)) {
                b = false;
            }
        }
        if (b) {
            System.out.println("It is a Strange number.");
        } else {
            System.out.println("It is not a Strange number.");
        }

        sc.close();
    }
}
