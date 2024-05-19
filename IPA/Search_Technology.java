import java.util.*;

class Search_Technology {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of user:");
        int n = sc.nextInt();
        Associate as[] = new Associate[n];
        System.out.println("ENter all the details:");
        for (int i = 0; i < as.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String technology = sc.nextLine();
            int experience = sc.nextInt();
            as[i] = new Associate(id, name, technology, experience);
        }
        System.out.println("ENter the technology to search:");
        sc.nextLine();
        String techno = sc.nextLine();
        Associate as2[] = associatesForGivenTechnology(as, techno);

        if (as2.length > 0) {
            for (int i = 0; i < as2.length; i++) {
                System.out.println(as2[i].getId());
            }
        }
        sc.close();
    }

    public static Associate[] associatesForGivenTechnology(Associate as[], String techno) {
        Associate as1[] = new Associate[0];
        for (int i = 0; i < as.length; i++) {
            if (as[i].getTechno().equalsIgnoreCase(techno) && as[i].getExperience() % 5 == 0) {
                as1 = Arrays.copyOf(as1, as1.length + 1);
                as1[as1.length - 1] = as[i];
            }
        }
        return as1;
    }
}

class Associate {
    private int id;
    private String name;
    private String technology;
    private int experience;

    public Associate(int id, String name, String technology, int experience) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experience = experience;
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

    public String getTechno() {
        return technology;
    }

    public void setTechno(String technology) {
        this.technology = technology;
    }

    public int getExperience() {
        return experience;
    }

    public void setExper(int experience) {
        this.experience = experience;
    }
}
