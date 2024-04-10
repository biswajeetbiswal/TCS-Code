import java.util.*;
class Reminder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String s=sc.next();
        System.out.println("Enter the key:");
        int key=sc.nextInt();
        int num,rem=0;
        for(int i=0;i<s.length();i++)
        {
            num=(rem*10)+(s.charAt(i)-'0');
            rem=num%key;
        }
        System.out.println("The reminder is:"+rem);
    }
}