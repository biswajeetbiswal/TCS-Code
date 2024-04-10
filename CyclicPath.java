import java.util.*;
class CyclicPath
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String busStops[] ={"TH", "GA", "IC", "HA", "TE", "LU", "NI","CA"};
        int price[]={800, 600, 750, 900, 1400, 1200, 1100, 1500};
        System.out.println("Enter first string:");
        String s1=sc.next();
        System.out.println("Enter secind string:");
        String s2=sc.next();
       int si=0,ei=0;
       for(int i=0;i<busStops.length;i++)
       {
        if(s1.equals(busStops[i]))
        {
            si=i;
        }
        if(s2.equals(busStops[i]))
        {
            ei=i;
        }
       } 
       if(si==ei)
       {
        System.out.println("Invalid INput");
       }
       int sum=0;
       si=si+1;
       while(si!=ei+1)
       {
            sum+=price[si];
            si=(si+1)%8;
       }
        System.out.println(Math.ceil(sum*.005));
    }
}