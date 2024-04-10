import java.util.*;
class ColorBambo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of bambos: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter the bambo colors: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        int minute=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='G')
            {
                continue;
            }
            minute++;
            // System.out.println(minute);
            int y= (i+k)>=arr.length?arr.length:(i+k);
            // System.out.println(y);
            for(int j=i;j<y;j++)
            {
                if(arr[j]=='R')
                {
                    arr[j]='G';
                }
                else
                {
                    arr[j]='R';
                }
            }
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        System.out.println("Total minute required is: "+minute);
    }
}