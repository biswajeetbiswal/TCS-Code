import java.util.*;

class NavalVessel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. date:");
        int n = sc.nextInt();
        Vessel vs[] = new Vessel[n];
        System.out.println("Enter the data details:");
        for (int i = 0; i < vs.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String ve = sc.nextLine();
            int pl = sc.nextInt();
            int co = sc.nextInt();
            sc.nextLine();
            String pur = sc.nextLine();
            vs[i] = new Vessel(id, ve, pl, co, pur);
        }

        System.out.println("Enter the percentage to compare:");
        int percen = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the purpose :");
        String p = sc.nextLine();
        int avg = findAvgVoyagesByPct(vs, percen);
        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("NO anyone belongs to the catagory.");
        }

        Vessel v = findVesselByGrade(vs, p);
        if (v != null) {
            System.out.println(v.getName() + " " + v.getClassi());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
        sc.close();
    }

    public static int findAvgVoyagesByPct(Vessel vs[], int percen) {
        int sum = 0, count = 0;
        for (int i = 0; i < vs.length; i++) {
            if (((vs[i].getComp() * 100) / vs[i].getPlanned()) >= percen) {
                sum += vs[i].getComp();
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        }
        return sum;
    }

    public static Vessel findVesselByGrade(Vessel vs[], String p) {
        Vessel v = null;
        for (int i = 0; i < vs.length; i++) {
            if (vs[i].getPurpose().equalsIgnoreCase(p)) {
                int percen = (vs[i].getComp() * 100) / vs[i].getPlanned();
                if (percen == 100) {
                    vs[i].setClassi("Star");
                } else if (percen >= 80 && percen <= 99) {
                    vs[i].setClassi("Leader");
                } else if (percen >= 55 && percen <= 79) {
                    vs[i].setClassi("Inspier");
                } else {
                    vs[i].setClassi("Striver");
                }
                v = vs[i];
                break;
            }
        }
        return v;
    }
}

class Vessel {
    private int vesselId;
    private String vesselName;
    private int planned;
    private int completed;
    private String purpose;
    private String classification;

    public Vessel(int vesselId, String vesselName, int planned, int completed, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.planned = planned;
        this.completed = completed;
        this.purpose = purpose;
    }

    public int getId() {
        return vesselId;
    }

    public void setId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getName() {
        return vesselName;
    }

    public void setName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getPlanned() {
        return planned;
    }

    public void setPlan(int planned) {
        this.planned = planned;
    }

    public int getComp() {
        return completed;
    }

    public void setComp(int completed) {
        this.completed = completed;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getClassi() {
        return classification;
    }

    public void setClassi(String classification) {
        this.classification = classification;
    }
}