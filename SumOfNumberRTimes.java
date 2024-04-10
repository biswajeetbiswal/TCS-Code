import java.util.*;
class SumOfNumberRTimes
{
    int result(int n,int m)
    {
        if(m==0)
        {
            return 0;
        }
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum+=x;
            n=n/10;
        }
        sum=sum*m;
        int res=0;
        while(sum>0)
        {
            int x=sum%10;
            res+=x;
            sum=sum/10;
        }
        return res;
    }
    public static void main(String args[])
    {
        SumOfNumberRTimes sum=new SumOfNumberRTimes();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number as input: ");
        int n=sc.nextInt();
        System.out.println("Enter no. of times repeted process: ");
        int m=sc.nextInt();
        System.out.println(sum.result(n,m));
    }
}