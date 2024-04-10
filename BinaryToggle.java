import java.util.*;
class BinaryToggle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            int x=n%2;
            sb.append(x);
            n=n/2;
        }
        sb.reverse();
        String s=sb.toString();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int y=(s.charAt(i)-'0')*(int)Math.pow(2,i);
            sum+=y;
        }
        System.out.println(sum);
    }
}