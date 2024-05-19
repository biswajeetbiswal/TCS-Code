import java.util.*;

class Autonomous_Car {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of car:");
        int n = sc.nextInt();
        Car c1[] = new Car[n];
        System.out.println("ENter the all details:");
        for (int i = 0; i < c1.length; i++) {
            int carId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt();
            int noOfTestsPassed = sc.nextInt();
            sc.nextLine();
            String enviroment = sc.nextLine();
            c1[i] = new Car(carId, brand, noOfTestsConducted, noOfTestsPassed, enviroment);
        }

        System.out.println("Enter the enviroment for calculating sum:");
        String s = sc.nextLine();
        int sum = findTestPassedByEnv(c1, s);
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }
        System.out.println("ENter the brand to calculate grade:");
        String b = sc.nextLine();
        Car c2 = updateCarGrade(c1, b);
        if (c2 != null) {
            System.out.println(c2.getBrand() + "::" + c2.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }
        sc.close();
    }

    public static int findTestPassedByEnv(Car c1[], String s) {
        int sum = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i].getEnviroment().equalsIgnoreCase(s)) {
                sum += c1[i].getTestPassed();
            }
        }
        return sum;
    }

    public static Car updateCarGrade(Car c1[], String b) {
        Car c3 = null;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i].getBrand().equalsIgnoreCase(b)) {
                int cal = (c1[i].getTestPassed() * 100) / c1[i].getTestCounted();
                if (cal >= 80) {
                    c1[i].setGrade("A1");
                } else {
                    c1[i].setGrade("B2");
                }
                c3 = c1[i];
            }
        }
        return c3;
    }
}

class Car {
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String enviroment;
    private String grade;

    public Car(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String enviroment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.enviroment = enviroment;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTestCounted() {
        return noOfTestsConducted;
    }

    public void setTestCounted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public int getTestPassed() {
        return noOfTestsPassed;
    }

    public void setTestPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsConducted;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
