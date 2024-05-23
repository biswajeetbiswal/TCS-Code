import java.util.*;

class Fruits_IPA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no. of data to be entered:");
        int n = sc.nextInt();
        Fruits fr[] = new Fruits[n];
        System.out.println("Enter the data");
        for (int i = 0; i < fr.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            int rating = sc.nextInt();
            fr[i] = new Fruits(id, name, price, rating);
        }

        System.out.println("Enter the rating to find the maximum price of the array objects:");
        int ra = sc.nextInt();

        Fruits f = findMaximumPriceByRating(fr, ra);
        if (f != null) {
            System.out.println(f.getId());
        } else {
            System.out.println("No such Fruit");
        }
        sc.close();
    }

    public static Fruits findMaximumPriceByRating(Fruits fr[], int ra) {
        Fruits fe[] = new Fruits[0];
        for (int i = 0; i < fr.length; i++) {
            if (fr[i].getRating() > ra) {
                fe = Arrays.copyOf(fe, fe.length + 1);
                fe[fe.length - 1] = fr[i];
            }
        }

        for (int i = 0; i < fe.length - 1; i++) {
            for (int j = 0; j < fe.length - 1 - i; j++) {
                if (fe[j].getPrice() < fe[j + 1].getPrice()) {
                    Fruits fy = fe[j];
                    fe[j] = fe[j + 1];
                    fe[j + 1] = fy;
                }
            }
        }

        if (fe.length > 0) {
            return fe[0];
        }
        return null;
    }
}

class Fruits {
    private int id;
    private String name;
    private int price;
    private int rating;

    public Fruits(int id, String name, int price, int rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
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
}
