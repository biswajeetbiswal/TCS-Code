import java.util.*;
class DelhiPollution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of vehicle: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the vehicle last registration number: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the dates: ");
        int d=sc.nextInt();
        System.out.println("Enter the amount of fine: ");
        int fine=sc.nextInt();
        int count=0;
        if(d%2==0)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2!=0)
                {
                    count++;
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    count++;
                }
            }
        }
        System.out.println("Total fine: "+(count*fine));
    }
}