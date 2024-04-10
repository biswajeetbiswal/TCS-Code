import java.util.*;
class ModifyString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.next();
        System.out.println("Enter the second string:");
        String s2=sc.next();
        System.out.println("Enter the third string:");
        String s3=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                sb.append("%");
            }
            else
            {
                sb.append(ch);
            }
        }
        for(int i=0;i<s2.length();i++)
        {
           char ch=s2.charAt(i);
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'||ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U')
            {
                sb.append("#");
            }
            else
            {
                sb.append(ch);
            } 
        }
         for(int i=0;i<s3.length();i++)
        {
           char ch=s3.charAt(i);
           sb.append(Character.toUpperCase(ch));
        }
        String s=sb.toString();
        System.out.println(s);
    }
}