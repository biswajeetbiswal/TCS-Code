import java.util.*;
class Trainy
{
    public static void main(String args[])
    {
        int arr[]=new int[9];
        int arr1[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++)
        {
           int n=sc.nextInt();
           if(1<=n&&n<=100)
           {
            arr[i]=n;
           }
        }
        arr1[0]=(arr[0]+arr[3]+arr[6])/3;
        arr1[1]=(arr[1]+arr[4]+arr[7])/3;
        arr1[2]= (arr[2]+arr[5]+arr[8])/3;
       int n=Math.max(arr1[0],Math.max(arr1[1],arr1[2]));
        if(n>70)
        {
            for(int i=0;i<3;i++)
            {
                if(arr1[i]==n)
                {
                    System.out.println("trainee"+(i+1));
                }
            }
        }
        else
        {
            System.out.println("Trainee are not fit");
        }
    }
}