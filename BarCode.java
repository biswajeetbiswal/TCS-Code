import java.util.*;
class BarCode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the barcode number:");
        String s=sc.next();
        int sum=1;
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'0';
            sum*=x;
        }
        System.out.println(sum);
    }
}