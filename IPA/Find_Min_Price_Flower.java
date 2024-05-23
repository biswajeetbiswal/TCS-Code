import java.util.*;

class Find_Min_Price_Flower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of data to be entered:");
        int n = sc.nextInt();
        Flower fl[] = new Flower[n];
        System.out.println("Enter the data:");
        for (int i = 0; i < fl.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            int rating = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();
            fl[i] = new Flower(id, name, price, rating, type);
        }

        System.out.println("ENter the type to match:");
        String s = sc.nextLine();
        Flower f = findMinPriceByType(fl, s);
        if (f != null) {
            System.out.println(f.getId());
        } else {
            System.out.println("There is no flower with given type");
        }
        sc.close();
    }

    public static Flower findMinPriceByType(Flower fl[], String s) {
        Flower f1 = null;
        int amt = Integer.MAX_VALUE;
        for (int i = 0; i < fl.length; i++) {
            if (fl[i].getType().equalsIgnoreCase(s) && fl[i].getRating() > 3) {
                if (amt > fl[i].getPrice()) {
                    f1 = fl[i];
                    amt = fl[i].getPrice();
                }
            }
        }
        return f1;
    }
}

class Flower {
    private int id;
    private String name;
    private int price;
    private int rating;
    private String type;

    public Flower(int id, String name, int price, int rating, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.type = type;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}