import java.util.*;

class Update_GradePoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of input:");
        int n = sc.nextInt();
        Institution in[] = new Institution[n];
        System.out.println("Enter the details:");
        for (int i = 0; i < in.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int placed = sc.nextInt();
            int cleared = sc.nextInt();
            sc.nextLine();
            String loc = sc.nextLine();
            in[i] = new Institution(id, name, placed, cleared, loc);
        }

        System.out.println("Enter the location to find cleared student:");
        String loc = sc.nextLine();
        System.out.println("Enter the institute name:");
        String ini = sc.nextLine();
        int sum = findNumClearancedByLoc(in, loc);
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution in1 = updateInstitutionGrade(in, ini);
        if (in1 != null) {
            System.out.println(in1.getName() + "::" + in1.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }
        sc.close();
    }

    public static int findNumClearancedByLoc(Institution in[], String location) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i].getLocation().equalsIgnoreCase(location)) {
                count += in[i].getCleared();
            }
        }
        return count;
    }

    public static Institution updateInstitutionGrade(Institution in[], String ini) {
        int i;
        for (i = 0; i < in.length; i++) {
            if (ini.equalsIgnoreCase(in[i].getName())) {
                int rating = (in[i].getPlaced() * 100) / in[i].getCleared();
                if (rating >= 80) {
                    in[i].setGrade("A");
                } else {
                    in[i].setGrade("B");
                }
                break;
            }
        }
        return in[i];
    }

}

class Institution {
    private int institutionId;
    private String institutionName;
    private int noOfStudentPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentPlaced, int noOfStudentsCleared,
            String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentPlaced = noOfStudentPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;

    }

    public int getId() {
        return institutionId;
    }

    public void setId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getName() {
        return institutionName;
    }

    public void setName(String institutionName) {
        this.institutionName = institutionName;
    }

    public int getPlaced() {
        return noOfStudentPlaced;
    }

    public void setPlaced(int noOfStudentPlaced) {
        this.noOfStudentPlaced = noOfStudentPlaced;
    }

    public int getCleared() {
        return noOfStudentsCleared;
    }

    public void setCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
