import java.util.*;
class RotateImage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=j)
                {
                    int x=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int x=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=x;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}