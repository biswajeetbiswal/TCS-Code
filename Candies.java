import java.util.*;
class Candies
{
    public static void main(String args[])
    {
        int n=10,k=5;
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num>=1&&num<=n-5)
        {
            System.out.println("NUMBER OF CANDIES SOLD : "+num);
            System.out.println("NUMBER OF CANDIES LEFT : "+(n-num));
        }
        else
        {
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : "+n);
        }
    }
}