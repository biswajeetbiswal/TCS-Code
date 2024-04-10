import java.util.*;
class StringValidation
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int x=0,y=0;
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)=='*')
          {
              x++;
          }
          if(s.charAt(i)=='#')
          {
              y++;
          }
      }
      System.out.println(x-y);
    }
}