import java.util.*;
class NoOfEvenFloor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of floors:");
        int n=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(map.containsKey(x))
            {
                int count=map.get(x);
                map.put(x,++count);
            }
            else
            {
                map.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            if(e.getValue()%2==0)
            {
                System.out.println("Even floor: "+e.getKey());
                break;
            }
        }
    }
}