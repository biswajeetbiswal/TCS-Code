import java.util.*;

class Company_Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the company name:");
        String s = sc.nextLine();
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        Employee e1[] = new Employee[n];
        System.out.println("Enter the Employee details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee" + (i + 1) + " details:");
            int x = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            double d = sc.nextDouble();
            e1[i] = new Employee(x, s1, s2, d);
        }

        Company com = new Company(s, e1, n);

        double sal = com.getAvgSalary(e1);
        System.out.println("The average salary is:" + sal);

        double maxSalary = com.getMaxSalary(e1);
        System.out.println("Max Salary is: " + maxSalary);
        sc.nextLine();
        System.out.println("Enter the designation of employees:");
        String s3 = sc.nextLine();

        Employee e2[] = com.getEmployees(e1, s3);
        if (e2 != null) {
            for (int i = 0; i < e2.length; i++) {
                System.out.println("ID: " + e2[i].getId() + ", Name: " + e2[i].getName() + ", Designation: "
                        + e2[i].getDesignation() + ", Salary: " + e2[i].getSalary());
            }
        }
        sc.close();
    }
}

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
}

class Company {
    private String comName;
    private Employee[] emp;
    private int numEmp;

    public Company(String comName, Employee[] emp, int numEmp) {
        this.comName = comName;
        this.emp = emp;
        this.numEmp = numEmp;
    }

    public double getAvgSalary(Employee e1[]) {
        double d2 = 0;
        for (int i = 0; i < e1.length; i++) {
            d2 += e1[i].getSalary();
        }
        return d2 / e1.length;
    }

    public double getMaxSalary(Employee e1[]) {
        double d3 = 0;
        for (int i = 0; i < e1.length; i++) {
            if (d3 < e1[i].getSalary()) {
                d3 = e1[i].getSalary();
            }
        }
        return d3;
    }

    public Employee[] getEmployees(Employee e1[], String s3) {
        Employee e2[] = new Employee[0];
        for (int i = 0; i < e1.length; i++) {
            if ((e1[i].getDesignation()).equalsIgnoreCase(s3)) {
                e2 = Arrays.copyOf(e2, e2.length + 1);
                e2[e2.length - 1] = e1[i];
            }
        }
        if (e2.length > 0) {
            return e2;
        }
        return null;
    }
}