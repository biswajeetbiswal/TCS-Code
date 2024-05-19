import java.util.*;

class CourseProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of course");
        int n = sc.nextInt();
        Course c1[] = new Course[n];
        System.out.println("Enter the course details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the course " + (i + 1) + " details:");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String admin = sc.nextLine();
            int quiz = sc.nextInt();
            int hand = sc.nextInt();
            c1[i] = new Course(id, name, admin, quiz, hand);
        }
        sc.nextLine();
        System.out.println("Enter the admin name:");
        String ad = sc.nextLine();
        int avg = getAvgQuiz(c1, ad);
        if (avg == 0) {
            System.out.println("No course found.");
        } else {
            System.out.println(avg);
        }

        System.out.println("Enter the handson for comparison purpose:");
        int x = sc.nextInt();
        Course c2[] = getsortCourseByHandsOn(c1, x);
        if (c2 == null) {
            System.out.println("No Course found with mentioned attribute.");
        } else {
            for (int i = 0; i < c2.length; i++) {
                System.out.println(c2[i].getCName());
            }
        }
        sc.close();
    }

    public static int getAvgQuiz(Course c1[], String ad) {
        int sum = 0, count = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i].getCAdmin().equalsIgnoreCase(ad)) {
                sum += c1[i].getQuiz();
                count++;
            }
        }
        return sum / count;
    }

    public static Course[] getsortCourseByHandsOn(Course c1[], int x) {
        Course c2[] = new Course[0];
        for (int i = 0; i < c1.length; i++) {
            if (c1[i].getHandson() < x) {
                c2 = Arrays.copyOf(c2, c2.length + 1);
                c2[c2.length - 1] = c1[i];
            }
        }

        for (int i = 0; i < c2.length - 1; i++) {
            for (int j = 0; j < c2.length - 1 - i; j++) {
                if (c2[j].getHandson() > c2[j + 1].getHandson()) {
                    Course c3 = c2[j];
                    c2[j] = c2[j + 1];
                    c2[j + 1] = c3;
                }
            }
        }
        if (c2.length > 0) {
            return c2;
        }
        return null;
    }
}

class Course {
    private int cId;
    private String cName;
    private String cAdmin;
    private int quiz;
    private int handson;

    public int getId() {
        return cId;
    }

    public String getCName() {
        return cName;
    }

    public String getCAdmin() {
        return cAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }

    public Course(int cId, String cNmae, String cAdmin, int quiz, int handson) {
        this.cId = cId;
        this.cName = cNmae;
        this.cAdmin = cAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }
}
