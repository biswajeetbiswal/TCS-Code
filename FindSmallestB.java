import java.util.*;
class FindSmallestB
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum=0,j=0;
        for(int i=9;i>=2;i--)
        {
            if(n%i==0)
            {
                n=n/i;
                sum=sum+(int)((Math.pow(10,j))*i);
                j++;
            }
        }
        System.out.println("B is: "+sum);
    }
}