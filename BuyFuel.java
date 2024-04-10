import java.util.*;
class BuyFuel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of container:");
        int n=sc.nextInt();
        System.out.println("Enter the available price:");
        int m=sc.nextInt();
        int price[]=new int[n];
        System.out.println("Enter prices of fule:");
        for(int i=0;i<n;i++)
        {
            price[i]=sc.nextInt();
        }
        int volume[]=new int[n];
        System.out.println("Enter the volumes of fuel:");
        for(int i=0;i<n;i++)
        {
            volume[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(price[i],volume[i]);
        }
       ArrayList<Integer> list = new ArrayList<>(map.keySet());
        for(int x:list)
        {
            System.out.println(x);
        }

    }
}