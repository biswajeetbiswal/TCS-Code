import java.util.*;

class Find_Student_By_Grade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of input you entered:");
        int n = sc.nextInt();
        Student st[] = new Student[n];
        System.out.println("Enter the details:");
        for (int i = 0; i < st.length; i++) {
            int no = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char ch = sc.next().charAt(0);
            sc.nextLine();
            String date = sc.nextLine();
            st[i] = new Student(no, name, subject, ch, date);
        }

        System.out.println("Enter the grade to compare:");
        char gr = sc.next().charAt(0);
        System.out.println("Enter the month to be compared:");
        int month = sc.nextInt();
        Student s[] = findStudentByGradeAndMonth(st, gr, month);
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i].getName());
                System.out.println(s[i].getSubject());
            }
            System.out.println(s.length);
        } else {
            System.out.println("No student found");
        }
        sc.close();
    }

    public static Student[] findStudentByGradeAndMonth(Student st[], char gr, int month) {
        Student s2[] = new Student[0];
        for (int i = 0; i < st.length; i++) {
            if (st[i].getGrade() == gr) {
                String date = st[i].getDate();
                date = date.substring(3, 5);
                int d = Integer.parseInt(date);
                if (d == month) {
                    s2 = Arrays.copyOf(s2, s2.length + 1);
                    s2[s2.length - 1] = st[i];
                }
            }
        }
        if (s2.length > 0) {
            return s2;
        }
        return null;
    }
}

class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    public Student(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRoll() {
        return rollNo;
    }

    public void setRoll(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setGrade(String date) {
        this.date = date;
    }
}