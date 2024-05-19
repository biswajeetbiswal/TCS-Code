import java.util.*;

class ConnectNRopes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of ropes:");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the ropes length:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            Collections.sort(list);
            int num = (list.get(0) + list.get(1));
            sum += num;
            list.add(num);
            list.remove(0);
            list.remove(0);
        }
        System.out.println("Total sum" + sum);
        sc.close();
    }
}
