import java.util.*;
class MatrixDiagonalDifference
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
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
        int left=0,right=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    left+=arr[i][j];
                }
                if(i+j==(n-1))
                {
                    right+=arr[i][j];
                }
            }
        }
        // System.out.println(left+" "+right);
        System.out.println(Math.abs(left-right));
    }
}