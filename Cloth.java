import java.util.*;
class Cloth
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2000)
        {
            System.out.println("Time estimate is:25 minutes");
        }
        else if(n>=2001&&n<=4000)
        {
            System.out.println("Time estimate is :35 minutes");
        }
        else if(n<=7000)
        {
            System.out.println("TIme estimate is: 45 minutes");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}