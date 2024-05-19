import java.util.*;

class Medicine_Get_Price_By_Disease {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of medicine:");
        int n = sc.nextInt();
        Medicine md[] = new Medicine[n];
        System.out.println("Enter the details:");
        for (int i = 0; i < md.length; i++) {
            sc.nextLine();
            String mn = sc.nextLine();
            String bt = sc.nextLine();
            String di = sc.nextLine();
            int pr = sc.nextInt();
            md[i] = new Medicine(mn, bt, di, pr);
        }

        // for (int i = 0; i < md.length; i++) {
        // System.out.println("Name:" + md[i].getMedicineName());
        // System.out.println("BatchName:" + md[i].getBatch());
        // System.out.println("Disease name:" + md[i].getDisease());
        // System.out.println("Price:" + md[i].getPrice());
        // }

        System.out.println("Enter the disease name to find price of medine:");
        sc.nextLine();
        String s = sc.nextLine();
        Medicine md1[] = getPriceByDisease(md, s);

        if (md1.length > 0) {
            for (int i = 0; i < md1.length; i++) {
                System.out.println(md1[i].getPrice());
            }
        } else {
            System.out.println("No disease found");
        }
        sc.close();
    }

    public static Medicine[] getPriceByDisease(Medicine md[], String s) {
        Medicine md2[] = new Medicine[0];
        for (int i = 0; i < md.length; i++) {
            if (md[i].getDisease().equalsIgnoreCase(s)) {
                md2 = Arrays.copyOf(md2, md2.length + 1);
                md2[md2.length - 1] = md[i];
            }
        }
        return md2;
    }
}

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
