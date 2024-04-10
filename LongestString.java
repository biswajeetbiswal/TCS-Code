import java.util.*;
class LongestString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        int length=0;
        for(String s1:arr)
        {
            if(length<s1.length())
            {
                length=s1.length();
            }
        }
        System.out.println(length);
    }
}