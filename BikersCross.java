import java.util.*;
class BikersCross
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of bike:");
        int n=sc.nextInt();
        int zero=0,count=0;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(x==0)
            {
                zero++;
            }
            else
            {
                count+=zero;
            }
        }
        System.out.println("Total bike crossing:"+count);
    }
}