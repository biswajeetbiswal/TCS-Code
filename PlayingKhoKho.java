import java.util.*;
class PlayingKhoKho
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of player: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the players digit: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(arr[0]!=arr[i])
            {
                count++;
            }
        }
        System.out.println("No. of player not understood the digit is: "+count);
    }
}