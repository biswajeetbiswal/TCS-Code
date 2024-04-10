import java.util.*;
class PalindromeSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        while(true)
        {
            String s=Integer.toString(n);
            StringBuilder sb=new StringBuilder(s);
            s=(sb.reverse()).toString();
            int x=Integer.parseInt(s);
            if(n==x)
            {
                break;
            }
            else
            {
                n+=x;
            }
        }
        System.out.println("The palindrome number is: "+n);
    }
}