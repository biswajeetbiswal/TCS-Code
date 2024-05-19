import java.util.*;

public class SecondSmallestSalary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of employees:");
        int x = sc.nextInt();
        Employees ee[] = new Employees[x];
        System.out.println("ENter all the details:");
        for (int i = 0; i < x; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            char gender = sc.next().charAt(0);
            double salary = sc.nextDouble();
            ee[i] = new Employees(id, name, age, gender, salary);
        }
        System.out.println("Enter the age for matching:");
        int n = sc.nextInt();
        Employees e1 = getEmployeeWithSecondLowestSalary(ee);
        if (e1 == null) {
            System.out.println("Less no. of employees.");
        } else {
            System.out.println(e1.getId() + "#" + e1.getName());
        }

        int e2 = countEmployeesBasedOnAge(ee, n);
        System.out.println(e2);
        sc.close();
    }

    public static Employees getEmployeeWithSecondLowestSalary(Employees ee[]) {
        if (ee.length < 2) {
            return null;
        }
        for (int i = 0; i < ee.length - 1; i++) {
            for (int j = 0; j < ee.length - i - 1; j++) {
                if (ee[j].getSalary() > ee[j + 1].getSalary()) {
                    Employees k = ee[j];
                    ee[j] = ee[j + 1];
                    ee[j + 1] = k;
                }
            }
        }
        return ee[1];
    }

    public static int countEmployeesBasedOnAge(Employees ee[], int n) {
        int count = 0;
        for (int i = 0; i < ee.length; i++) {
            if (ee[i].getAge() == n) {
                count++;
            }
        }
        return count;
    }

}

class Employees {
    private int employeeId;
    private String employeeName;
    private int age;
    private char gender;
    private double salary;

    public int getId() {
        return employeeId;
    }

    public String getName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public Employees(int id, String name, int age, char gender, double salary) {
        employeeId = id;
        employeeName = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
}
