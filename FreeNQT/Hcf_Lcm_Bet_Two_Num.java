import java.util.*;

class Hcf_Lcm_Bet_Two_Num {

    static int findHcf(int n1, int n2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 2; i <= n1; i++) {
            while (n1 % i == 0) {
                if (map1.containsKey(i)) {
                    int count = map1.get(i);
                    map1.put(i, ++count);
                } else {
                    map1.put(i, 1);
                }
                n1 /= i;
            }
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 2; i <= n2; i++) {
            while (n2 % i == 0) {
                if (map2.containsKey(i)) {
                    int count = map2.get(i);
                    map2.put(i, ++count);
                } else {
                    map2.put(i, 1);
                }
            }
            n2 /= i;
        }
        int result = 1;
        for (Map.Entry<Integer, Integer> e : map2.entrySet()) {
            if (map1.containsKey(e.getKey())) {
                if (map1.get(e.getKey()) > e.getValue()) {
                    result *= e.getValue();
                } else {
                    result *= map1.get(e.getKey());
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int hcf = findHcf(num1, num2);
        System.out.println("Hcf is " + hcf);
        sc.close();
    }
}