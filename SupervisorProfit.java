import java.util.*;
class SupervisorProfit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of employee: ");
        int n=sc.nextInt();
        System.out.println("Enter the amount contains at nth level: ");
        int a=sc.nextInt();
        System.out.println("Enter the % profit goes to the superviser: ");
        int p=sc.nextInt();
        for(int i=0;i<n-1;i++){
            a=(a*p)/100;
        }
        System.out.println("The amount goes to the superviser is: "+a);
    }
}