import java.util.*;
class CountSubstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the string: ");
        int n=sc.nextInt();
        System.out.println("Enter the string: ");
        String s=sc.next();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String s1= s.substring(i,j); ;
                // if(j==n)
                // {
                //     s1=s.substring(i);
                // }
                // else
                // {
                //     s1=s.substring(i,j); 
                // }
                int x=0;
                for(int k=0;k<s1.length();k++)
                {
                    x+=(s1.charAt(k)-'0');
                }
                if(x!=s1.length())
                {
                    count++; 
                }
            }
        }
        System.out.println(count);
    }
}