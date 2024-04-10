import java.util.*;
class WaterPipe
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of incoming pipe: ");
        int n=sc.nextInt();
        System.out.println("Enter no. of outgoing pipe: ");
        int m=sc.nextInt();
        System.out.println("Enter the rust factor: ");
        int r=sc.nextInt();
        int input=0;
        System.out.println("Enter the input pipe details: ");
        for(int i=0;i<n;i++)
        {
            int y=sc.nextInt()-r;
            input+=y;
        }
        System.out.println("Enter the output pipe details: ");
        int output=0;
        for(int i=0;i<m;i++)
        {
            int x=sc.nextInt()-r;
            output+=x;
        }
        if(input==output)
        {
            System.out.println("BALANCED");
        }
        else if(input>output)
        {
            System.out.println(output-input-r);
        }
        else{
            System.out.println(output+r-input);
        }
    }
}