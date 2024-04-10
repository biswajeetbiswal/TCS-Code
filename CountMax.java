import java.util.*;
class CountMax
{
    public static void main(String args[])
    {
      int arr[][]={{0,1,0},{1,1,0},{1,1,1}};
      int max=0,count=0;
      for(int i=0;i<arr.length;i++)
      {
          int count1=0;
          for(int j=0;j<arr[0].length;j++)
          {
              if(arr[i][j]==1)
              {
                  count1++;
              }
          }
          if(count1>count)
          {
              count=count1;
              max=i+1;
          }
      }
      System.out.println(max);
    }
}