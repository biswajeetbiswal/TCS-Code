import java.util.*;
class Medicine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Med arr[]=new Med[4];
        for(int i=0;i<arr.length;i++)
        {
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            arr[i]=new Med(a,b,c,d);
        }
        System.out.println("Enter the diseases:");
        String q=sc.nextLine();
        int ans[]= find(arr,q);
        for(int a:ans)
        {
            System.out.println(a);
        }
    }

    public static int[] find(Med[]arr,String q)
        {
            ArrayList<Integer>list=new ArrayList();
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].getDis().equalsIgnoreCase(q))
                {
                    list.add(arr[i].getPrice());
                }
            }
            Collections.sort(list);
            int result[]=new int[list.size()];
            for(int i=0;i<result.length;i++)
            {
                result[i]=list.get(i);
            }
            return result;
            
        }    
}
class Med{
    private String name;
    private String batch;
    private String dis;
    private int price;

    public String getDis()
    {
        return dis;
    }
    public int getPrice()
    {
        return price;
    }

    public Med(String name,String batch,String dis,int price)
    {
        this.name=name;
        this.batch=batch;
        this.dis=dis;
        this.price=price;
    }
}