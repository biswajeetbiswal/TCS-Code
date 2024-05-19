import java.util.*;

class Player_Get_Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of data to be entered:");
        int n = sc.nextInt();
        Player pl[] = new Player[n];
        System.out.println("Enter the details:");
        for (int i = 0; i < pl.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int ic = sc.nextInt();
            int match = sc.nextInt();
            int runs = sc.nextInt();
            pl[i] = new Player(id, name, ic, match, runs);
        }
        System.out.println("Enter the target:");
        int t = sc.nextInt();
        double dt[] = findAverageOfRuns(pl, t);
        for (int i = 0; i < dt.length; i++) {
            if (dt[i] >= 80 && dt[i] <= 100) {
                System.out.println("Grade A");
            } else if (dt[i] >= 50 && dt[i] <= 79) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }
        sc.close();
    }

    public static double[] findAverageOfRuns(Player pl[], int t) {
        double db[] = new double[0];
        for (int i = 0; i < pl.length; i++) {
            if (pl[i].getMatch() >= t) {
                db = Arrays.copyOf(db, db.length + 1);
                db[db.length - 1] = (double) (pl[i].getScored() / pl[i].getMatch());
            }
        }
        return db;
    }
}

class Player {
    private int id;
    private String name;
    private int iccRank;
    private int matchesPLayed;
    private int runsScored;

    public Player(int id, String name, int iccRank, int matchesPLayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPLayed = matchesPLayed;
        this.runsScored = runsScored;
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

    public int getRank() {
        return iccRank;
    }

    public void setRank(int iccRank) {
        this.iccRank = iccRank;
    }

    public int getMatch() {
        return matchesPLayed;
    }

    public void setMatch(int matchesPLayed) {
        this.matchesPLayed = matchesPLayed;
    }

    public int getScored() {
        return runsScored;
    }

    public void setScored(int runsScored) {
        this.runsScored = runsScored;
    }
}