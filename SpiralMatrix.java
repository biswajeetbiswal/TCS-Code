import java.util.*;
class SpiralMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
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
        for(int i=0;i<n/2;i++)
        {
            int j,k;
            for(j=i;j<n-i;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            for(k=i+1;k<n-i;k++)
            {
                System.out.print(arr[k][j-1]+" ");
            }
            for(int l=j-2;l>=i;l--)
            {
                System.out.print(arr[k-1][l]+" ");
            }
            for(int m=j-2;m>i;m--)
            {
                System.out.print(arr[m][i]+" ");
            }
        }
        System.out.print(arr[n/2][n/2]);
    }
}