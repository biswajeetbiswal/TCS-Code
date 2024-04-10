import java.util.*;
class RemoveRepetedElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.next();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(!res.contains(Character.toString(s.charAt(i))))
            {
                res+=(Character.toString(s.charAt(i)));
            }
        }
        System.out.println(res);
    }
}