import java.util.*;
class ChocolateFactory
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of chocolate jar:");
        int c=sc.nextInt();
        int arr[]=new int[c];
        System.out.println("Enter the no. of chocolates per jar:");
        for(int i=0;i<c;i++)
        {
            arr[i]=sc.nextInt();
        }
        int choco[]=new int[c];
        int j=0;
        for(int i=0;i<c;i++)
        {
            if(arr[i]!=0)
            {
                choco[j++]=arr[i];
            }
        }
        for(int i=0;i<c;i++)
        {
            arr[i]=choco[i];
            System.out.print(arr[i]+" ");
        }
    }
}