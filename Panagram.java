import java.util.*;
class Panagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray())
        {
            if(ch>='a'&&ch<='z')
            {
                set.add(ch);
            }
            if(ch>='A'&&ch<='Z')
            {
                ch=Character.toLowerCase(ch);
                set.add(ch);
            }
        }
        if(set.size()==26)
        {
            System.out.println("This String is a panagram.");
        }
        else
        {
            System.out.println("This string is not a panagram.");
        }
    }
}