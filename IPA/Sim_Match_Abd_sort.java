import java.util.*;

class Sim_Match_Abd_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of the data to be entered:");
        int n = sc.nextInt();
        Sim sm[] = new Sim[n];
        System.out.println("Enter the data:");
        for (int i = 0; i < sm.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String comp = sc.nextLine();
            int bala = sc.nextInt();
            double rate = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();
            sm[i] = new Sim(id, comp, bala, rate, circle);
        }
        System.out.println("Enter the circle to be matched:");
        String cir = sc.nextLine();
        System.out.println("Enter the rate to be matched:");
        double rate = sc.nextDouble();
        sc.nextLine();
        System.out.println("ENter the circle1 for matching:");
        String cir1 = sc.nextLine();
        System.out.println("Enter the circle2 for matching:");
        String cir2 = sc.nextLine();
        Sim sm1[] = matchAndSort(sm, cir, rate);
        if (sm1.length > 0) {
            for (int i = 0; i < sm1.length; i++) {
                System.out.println(sm1[i].getId());
            }
        } else {
            System.out.println("No match found.");
        }

        Sim sm2[] = transferCircle(sm, cir1, cir2);
        if (sm2.length > 0) {
            for (int i = 0; i < sm2.length; i++) {
                System.out.println(
                        sm2[i].getId() + " " + sm2[i].getCompany() + " " + sm2[i].getCircle() + " " + sm2[i].getRate());

            }
        } else {
            System.out.println("No match found.");
        }
        sc.close();

    }

    public static Sim[] matchAndSort(Sim sm[], String cir, double rate) {
        Sim sim1[] = new Sim[0];
        for (int i = 0; i < sm.length; i++) {
            if (sm[i].getCircle().equalsIgnoreCase(cir) && sm[i].getRate() < rate) {
                sim1 = Arrays.copyOf(sim1, sim1.length + 1);
                sim1[sim1.length - 1] = sm[i];
            }
        }
        for (int i = 0; i < sim1.length - 1; i++) {
            for (int j = 0; j < sim1.length - 1 - i; j++) {
                if (sim1[j].getBalance() < sim1[j + 1].getBalance()) {
                    Sim s = sim1[j + 1];
                    sim1[j + 1] = sim1[j];
                    sim1[j] = s;
                }
            }
        }
        return sim1;
    }

    public static Sim[] transferCircle(Sim sm2[], String cir1, String cir2) {
        Sim sim2[] = new Sim[0];
        for (int i = 0; i < sm2.length; i++) {
            if (sm2[i].getCircle().equalsIgnoreCase(cir1)) {
                sm2[i].setCircle(cir2);
                sim2 = Arrays.copyOf(sim2, sim2.length + 1);
                sim2[sim2.length - 1] = sm2[i];
            }
        }

        for (int i = 0; i < sim2.length - 1; i++) {
            for (int j = 0; j < sim2.length - 1 - i; j++) {
                if (sim2[j].getRate() < sim2[j + 1].getRate()) {
                    Sim s = sim2[j];
                    sim2[j] = sim2[j + 1];
                    sim2[j + 1] = s;
                }
            }
        }
        return sim2;
    }
}

class Sim {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRate() {
        return ratePerSecond;
    }

    public void setRate(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}