import java.util.*;
class SetQuestion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of employees attempt question1,question2: ");
        int e1=sc.nextInt();
        System.out.println("Enter the no of employees attempt question2,question3: ");
        int e2=sc.nextInt();
        System.out.println("Enter the no of employees attempt question3,question1: ");
        int e3=sc.nextInt();
        System.out.println("Enter the no of employees who attempt all the questiion: ");
        int e=sc.nextInt();
        System.out.println("Enter the total no of employees: ");
        int total=sc.nextInt();
        System.out.println("Enter the no of employees who not attempt: ");
        int ne=sc.nextInt();
        int x=(total-ne)-(e1+e2+e3-2*e);
        System.out.println("No. of employee who attempt only one question: "+x);
        int y=x/3;
        int firstquestion=y+e1+e2-e;
        System.out.println("No. of employee who attempt first question: "+firstquestion);
    }
}