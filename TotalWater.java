import java.util.*;
class TotalWater
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of bar: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the heights of the bar: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left[]=new int[n];
        int right[]=new int[n];
        int max1=0;
        for(int i=0;i<n;i++)
        {
            max1=Math.max(max1,arr[i]);
            left[i]=max1;
        }
        int max2=0;
        for(int i=n-1;i>=0;i--)
        {
            max2=Math.max(max2,arr[i]);
            right[i]=max2;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=(int)Math.min(left[i],right[i])-arr[i];
        }
        System.out.println("Total quantity of water is: "+sum);
    }
}