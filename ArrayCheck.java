import java.util.*;
class ArrayCheck
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of elements:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements:");
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      int count=1;
      for(int i=1;i<arr.length;i++)
      {
          if(arr[i]>arr[i-1])
          {
              count++;
          }
      }
      System.out.println(count);
    }
}