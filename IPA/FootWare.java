import java.util.*;

class FootWare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of data to be entered:");
        int n = sc.nextInt();
        Ware wr[] = new Ware[n];
        System.out.println("Enter the data:");
        for (int i = 0; i < wr.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            wr[i] = new Ware(id, name, type, price);
        }
        sc.nextLine();
        System.out.println("Enter the type to be matched:");
        String ty = sc.nextLine();
        System.out.println("Enter the ware name to be matched:");
        String fName = sc.nextLine();
        int count = getCountByType(wr, ty);
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }

        Ware w = getSecondHighestPriceByBrand(wr, fName);
        if (w != null) {
            System.out.println(w.getId());
            System.out.println(w.getName());
            System.out.println(w.getPrice());
        } else {
            System.out.println("Brand not available");
        }
        sc.close();
    }

    public static int getCountByType(Ware wr[], String ty) {
        int count = 0;
        for (int i = 0; i < wr.length; i++) {
            if (wr[i].getType().equalsIgnoreCase(ty)) {
                count++;
            }
        }
        return count;
    }

    public static Ware getSecondHighestPriceByBrand(Ware wr[], String fName) {
        Ware w1[] = new Ware[0];
        for (int i = 0; i < wr.length; i++) {
            if (wr[i].getName().equalsIgnoreCase(fName)) {
                w1 = Arrays.copyOf(w1, w1.length + 1);
                w1[w1.length - 1] = wr[i];
            }
        }

        for (int i = 0; i < w1.length - 1; i++) {
            for (int j = 0; j < w1.length - 1 - i; j++) {
                if (w1[j].getPrice() < w1[j + 1].getPrice()) {
                    Ware w2 = w1[j];
                    w1[j] = w1[j + 1];
                    w1[j + 1] = w2;
                }
            }
        }
        if (w1.length > 1) {
            return w1[1];
        } else if (w1.length > 0) {
            return w1[0];
        } else {
            return null;
        }
    }
}

class Ware {
    private int id;
    private String name;
    private String type;
    private int price;

    public Ware(int id, String name, String type, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
