import java.util.*;
class AquaColor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        System.out.println("Enter the value of L: ");
        int l=sc.nextInt();
        int res=0;
        for(int i=0;i<s.length();i=i+l)
        {
            int length=i+l>s.length()?s.length():i+l;
            String sub=s.substring(i,length);
            int count=0;
            for(char ch:sub.toCharArray())
            {
                if(ch=='a')
                {
                    count++;
                }
            }
            if(count>res)
            {
                res=count;
            }
        }
        System.out.println("The labeled box is contains aqua is: "+res);
    }
}