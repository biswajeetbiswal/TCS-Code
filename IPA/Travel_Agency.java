import java.util.*;

class Travel_Agency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of data to be entered:");
        int n = sc.nextInt();
        Flight fh[] = new Flight[n];
        System.out.println("Enter the details:");
        for (int i = 0; i < fh.length; i++) {
            int reg = sc.nextInt();
            sc.nextLine();
            String agency = sc.nextLine();
            String packag = sc.nextLine();
            int pri = sc.nextInt();
            boolean flight = sc.nextBoolean();
            fh[i] = new Flight(reg, agency, packag, pri, flight);
        }

        System.out.println("Enter the regId:");
        int nid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the package type:");
        String packa = sc.nextLine();

        Flight fg = findAgencyWithHighestPackagePrice(fh);
        if (fg != null) {
            System.out.println(fg.getPrice());
        } else {
            System.out.println("There is no highest package available.");
        }

        Flight f2 = agencyDetailsForGivenldAndType(fh, nid, packa);
        if (f2 != null) {
            System.out.println(f2.getAgencyName() + ":" + f2.getPrice());
        } else {
            System.out.println("There is no amtch this id and package type.");
        }
        sc.close();
    }

    public static Flight findAgencyWithHighestPackagePrice(Flight fg[]) {
        Flight f = null;
        int p = Integer.MIN_VALUE;
        for (int i = 0; i < fg.length; i++) {
            if (p < fg[i].getPrice()) {
                p = fg[i].getPrice();
                f = fg[i];
            }
        }
        return f;
    }

    public static Flight agencyDetailsForGivenldAndType(Flight fh[], int nid, String pack) {
        Flight f1 = null;
        for (int i = 0; i < fh.length; i++) {
            if (fh[i].getRegNo() == nid && fh[i].getPackageType().equalsIgnoreCase(pack)
                    && fh[i].getFlightFacility() == true) {
                f1 = fh[i];
                break;
            }
        }
        return f1;
    }
}

class Flight {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public Flight(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}
