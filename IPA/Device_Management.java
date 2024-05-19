import java.util.*;

class Device_Management {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Phones:");
        int n = sc.nextInt();
        Phone ph[] = new Phone[n];
        System.out.println("Enter the data:");
        for (int i = 0; i < ph.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int price = sc.nextInt();
            ph[i] = new Phone(id, s1, s2, price);
        }
        sc.nextLine();
        System.out.println("Enter the brand to calculcate price:");
        String brand = sc.nextLine();
        int sum = findPriceForGivenBrand(ph, brand);
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("The given Brand is not available");
        }

        System.out.println("Enter the os to find the phone:");
        String os = sc.nextLine();
        Phone ph1[] = getPhoneIdBasedOnOs(ph, os);
        if (ph1.length > 0) {
            for (int i = 0; i < ph1.length; i++) {
                System.out.println(ph1[i].getId());
            }
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
        sc.close();
    }

    public static int findPriceForGivenBrand(Phone ph[], String brand) {
        int sum = 0;
        for (int i = 0; i < ph.length; i++) {
            if (brand.equalsIgnoreCase(ph[i].getBrand())) {
                sum += ph[i].getPrice();
            }
        }
        return sum;
    }

    public static Phone[] getPhoneIdBasedOnOs(Phone ph[], String os) {
        Phone ph2[] = new Phone[0];
        for (int i = 0; i < ph.length; i++) {
            if (os.equalsIgnoreCase(ph[i].getOs()) && ph[i].getPrice() >= 50000) {
                ph2 = Arrays.copyOf(ph2, ph2.length + 1);
                ph2[ph2.length - 1] = ph[i];
            }
        }
        return ph2;
    }
}

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return phoneId;
    }

    public void setId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
