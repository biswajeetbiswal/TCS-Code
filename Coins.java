import java.util.*;
class Coins
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int n=sc.nextInt();
        int five=(n-4)/5;
        int one=0;
        if((n-(5*five))%2==0)
        {
            one=2;
        }
        else
        {
            one=1;
        }
        int two=(n-(5*five)-one)/2;
        
        System.out.println("NO. of total coins: "+(five+two+one));
        System.out.println("NO. of five rupee coins: "+five);
        System.out.println("NO. of two rupee coins: "+two);
        System.out.println("NO. of one rupee coins: "+one);
    }
}