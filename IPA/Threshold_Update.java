import java.util.*;

class Threshold_Update {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of inputs:");
        int n = sc.nextInt();
        Inventory ivn[] = new Inventory[n];
        System.out.println("Enter details:");
        for (int i = 0; i < ivn.length; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            int mqty = sc.nextInt();
            int cqty = sc.nextInt();
            int thres = sc.nextInt();
            ivn[i] = new Inventory(id, mqty, cqty, thres);

        }
        System.out.println("Enter the limit:");
        int limit = sc.nextInt();
        Inventory iv[] = replenish(ivn, limit);
        if (iv.length > 0) {
            for (int i = 0; i < iv.length; i++) {
                if (iv[i].getThreshold() > 75) {
                    System.out.println(iv[i].getId() + " Critical Filling");
                } else if (iv[i].getThreshold() > 50 && iv[i].getThreshold() < 75) {
                    System.out.println(iv[i].getId() + " Moderate Filling");
                } else {
                    System.out.println(iv[i].getId() + " Non-Critical Filling");
                }
            }
        } else {
            System.out.println("Limit value is higher than THreshold");
        }
        sc.close();
    }

    public static Inventory[] replenish(Inventory ivn[], int limit) {
        Inventory ivn1[] = new Inventory[0];
        for (int i = 0; i < ivn.length; i++) {
            if (limit <= ivn[i].getThreshold()) {
                ivn1 = Arrays.copyOf(ivn1, ivn1.length + 1);
                ivn1[ivn1.length - 1] = ivn[i];
            }
        }
        return ivn1;
    }
}

class Inventory {
    private String id;
    private int maxQty;
    private int curQty;
    private int threshold;

    public Inventory(String id, int maxQty, int curQty, int threshold) {
        this.id = id;
        this.maxQty = maxQty;
        this.curQty = curQty;
        this.threshold = threshold;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQty() {
        return maxQty;
    }

    public void setQty(int maxQty) {
        this.maxQty = maxQty;
    }

    public int getCqty() {
        return curQty;
    }

    public void setCqty(int curQty) {
        this.curQty = curQty;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}
