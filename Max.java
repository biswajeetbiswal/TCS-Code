import java.util.*;
class Max
{
    public static void main(String args[])
    {
     int n=5;
     int entry[]={7,0,5,1,3};
     int leave[]={1,2,1,3,4};
     int max=entry[0]-leave[0],sum=entry[0]-leave[0];
     for(int i=1;i<n;i++)
     {
         sum+=(entry[i]-leave[i]);
         max=Math.max(sum,max);
     }
     System.out.println(max);
    }
}