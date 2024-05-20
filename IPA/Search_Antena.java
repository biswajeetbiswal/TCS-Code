import java.util.*;

class Search_Antena {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of data to be entered:");
        int n = sc.nextInt();
        Antenna an[] = new Antenna[n];
        System.out.println("Enter the details:");
        for (int i = 0; i < an.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String lead = sc.nextLine();
            double vswr = sc.nextDouble();
            an[i] = new Antenna(id, name, lead, vswr);
        }
        sc.nextLine();
        System.out.println("Enter the antenna name:");
        String nam = sc.nextLine();
        System.out.println("Enter the double vswr value for comparison:");
        double d = sc.nextDouble();

        int id = searchAntennaByName(an, nam);
        if (id != 0) {
            System.out.println(id);
        } else {
            System.out.println("There is no antenna with the given parameter");
        }

        Antenna ant[] = sortAntennaByVSWR(an, d);
        if (ant != null) {
            for (int i = 0; i < ant.length; i++) {
                System.out.println(ant[i].getProject());
            }
        } else {
            System.out.println("No Antenna found");
        }
        sc.close();
    }

    public static int searchAntennaByName(Antenna an[], String nam) {
        for (int i = 0; i < an.length; i++) {
            if (nam.equalsIgnoreCase(an[i].getName())) {
                return an[i].getId();
            }
        }
        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna an[], double d) {
        Antenna a[] = new Antenna[0];
        for (int i = 0; i < an.length; i++) {
            if (an[i].getVSWR() < d) {
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = an[i];
            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].getVSWR() > a[j + 1].getVSWR()) {
                    Antenna ad = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = ad;

                }
            }
        }

        if (a.length > 0) {
            return a;
        }
        return null;
    }
}

class Antenna {
    private int antennaId;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getId() {
        return antennaId;
    }

    public void setId(int antennaId) {
        this.antennaId = antennaId;
    }

    public String getName() {
        return antennaName;
    }

    public void setName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProject() {
        return projectLead;
    }

    public void setProject(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getVSWR() {
        return antennaVSWR;
    }

    public void setVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}
