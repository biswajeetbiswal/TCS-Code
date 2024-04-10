import java.util.*;
class FuelMerchant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of fuel container: ");
        int n=sc.nextInt();
        System.out.println("Enter the amount that hari contains: ");
        int amount=sc.nextInt();
        int prices[]=new int[n];
        System.out.println("Enter the prices of fuel container: ");
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        int fuel[]=new int[n];
        System.out.println("Enter the amount that fuel container contains: ");
        for(int i=0;i<n;i++)
        {
            fuel[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            if(prices[i]<=amount)
            {
                sum+=fuel[i];
                amount-=prices[i];
            }
        }

        System.out.println("Total volume of fuel buy by hari is:"+sum);
    }
}