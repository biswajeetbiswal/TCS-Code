import java.util.*;
class Painting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of interior wall:");
        int interior=sc.nextInt();
        System.out.println("Enter the no. of exterior wall:");
        int exterior=sc.nextInt();
        System.out.println("Enter the inner walls:");
        float sum=0;
        for(int i=0;i<interior;i++)
        {
            float n=sc.nextFloat();
            sum=sum+(n*18);
        }
        System.out.println("Enter the exterior wall");
        for(int i=0;i<exterior;i++)
        {
            float n=sc.nextFloat();
            sum=sum+(n*12);
        }
        System.out.println("Total cost:"+sum);
    }
}