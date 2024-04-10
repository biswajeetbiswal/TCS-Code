import java.util.*;
class Direction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the no. of path:");
        int n=sc.nextInt();
        int a=1;
        int x=0,y=0;
        while(a<=n)
        {
            if(a%4==1)
            {
                x+=(a*10);
                a++;
            }
            else if(a%4==2)
            {
                y+=(a*10);
                a++;
            }
            else if(a%4==3)
            {
                x-=(a*10);
                a++;
            }
            else{
                y-=(a*10);
                a++;
            }
        }
        System.out.println("x: "+x+" y: "+y);
    }
}