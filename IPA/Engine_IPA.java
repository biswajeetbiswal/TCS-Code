import java.util.*;

class Engine_IPA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no. of data to be entered:");
        int n = sc.nextInt();
        Engine eg[] = new Engine[n];
        System.out.println("Enter the data");
        for (int i = 0; i < eg.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            double d = sc.nextDouble();
            eg[i] = new Engine(id, name, type, d);
        }
        sc.nextLine();
        System.out.println("ENter the type to calculate the average of price:");
        String ty = sc.nextLine();
        System.out.println("Enter the name to find similar type object:");
        String na = sc.nextLine();

        double avg = findAvgEnginePriceByType(eg, ty);
        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("There are no engine with given type");
        }

        Engine e[] = searchEngineByName(eg, na);
        if (e.length > 0) {
            for (int i = 0; i < e.length; i++) {
                System.out.println(e[i].getId());
            }
        } else {
            System.out.println("There are no engine with the given name");
        }
        sc.close();
    }

    public static double findAvgEnginePriceByType(Engine eg[], String ty) {
        double sum = 0, count = 0;
        for (int i = 0; i < eg.length; i++) {
            if (eg[i].getType().equalsIgnoreCase(ty)) {
                sum += eg[i].getPrice();
                count++;
            }
        }
        if (count != 0) {
            return sum / count;
        }
        return sum;
    }

    public static Engine[] searchEngineByName(Engine eg[], String na) {
        Engine e1[] = new Engine[0];
        for (int i = 0; i < eg.length; i++) {
            if (eg[i].getName().equalsIgnoreCase(na)) {
                e1 = Arrays.copyOf(e1, e1.length + 1);
                e1[e1.length - 1] = eg[i];
            }
        }
        for (int i = 0; i < e1.length - 1; i++) {
            for (int j = 0; j < e1.length - 1 - i; j++) {
                if (e1[j].getId() > e1[j + 1].getId()) {
                    Engine e = e1[j];
                    e1[j] = e1[j + 1];
                    e1[j + 1] = e;
                }
            }
        }
        if (e1.length != 0) {
            return e1;
        }
        return null;
    }
}

class Engine {
    private int id;
    private String name;
    private String type;
    private double price;

    public Engine(int id, String name, String type, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}