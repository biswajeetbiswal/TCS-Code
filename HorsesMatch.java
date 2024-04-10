import java.util.*;
class HorsesMatch
{
    public static void main(String arsg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of horses: ");
        int n=sc.nextInt();
        System.out.println("Alice have amount: ");
        int x=sc.nextInt();
        System.out.println("Enter the amount of each horse: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;int count=0;int max=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum<x)
            {
                count++;
            }
            else{
                sum=arr[i];
                if(max<=count)
                {
                    max=count;
                    count=1;
                }
            }
        }
        if(max<=count)
        {
            max=count;
        }
        System.out.println("Maximum no. of horses on bet: "+max);
    }
}