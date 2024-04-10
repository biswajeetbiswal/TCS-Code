import java.util.*;
class GemotricSeries
{
    public static void main(String args[])
    {
        int arr[]={1,1,2,3,4,9,8,27};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position you want to show it:");
        int n=sc.nextInt();
        if(n%2!=0)
        {
            int x=(n/2);
            System.out.println((int)Math.pow(2,x));
        }
        else
        {
            int x=(n/2)-1;
            System.out.println((int)Math.pow(3,x));
        }
    }
}