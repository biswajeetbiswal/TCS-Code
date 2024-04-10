import java.util.*;
class StringGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1=sc.next();
        System.out.println("Enter the second string: ");
        String s2=sc.next();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s1.length();i++)
        {
            set.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++)
        {
            if(set.contains(s2.charAt(i)))
            {
                set.remove(s2.charAt(i));
            }
        }
        String s="";
        for(int i=0;i<s1.length();i++)
        {
            if(set.contains(s1.charAt(i)))
            {
                s+=s1.charAt(i);
            }
        }
        System.out.println(s);
    }
}