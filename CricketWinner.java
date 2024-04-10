import java.util.*;
class CricketWinner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no. of team: ");
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<(n*(n-1))/2;i++)
        {
            System.out.println("Enter the string: ");
            String s=sc.nextLine();
            String s1=s.substring(4);
            String arr[]=s1.split("-");
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);
            if(a>b)
            {
                int x=a-b;
                if(map.containsKey(s.charAt(0)))
                {
                    int count=map.get(s.charAt(0));
                    map.put(s.charAt(0),count+(x*3));
                }
                else
                {
                    map.put(s.charAt(0),3);
                }
            }
            else if(b>a)
            {
                int x=b-a;
                if(map.containsKey(s.charAt(2)))
                {
                    int count=map.get(s.charAt(2));
                    map.put(s.charAt(2),count+(x*3));
                }
                else
                {
                    map.put(s.charAt(2),3);
                }
            }
            else{
                if(map.containsKey(s.charAt(0)))
                {
                    int count=map.get(s.charAt(0));
                    map.put(s.charAt(0),count+1);
                }
                else
                {
                    map.put(s.charAt(0),1);
                }
                if(map.containsKey(s.charAt(2)))
                {
                    int count=map.get(s.charAt(2));
                    map.put(s.charAt(2),count+1);
                }
                else
                {
                    map.put(s.charAt(2),1);
                }
            }
        }
        char ch='0';int num=0;
        for(Map.Entry<Character,Integer>e:map.entrySet())
        {
            if(num<e.getValue())
            {
                num=e.getValue();
                ch=e.getKey();
            }
        }
        System.out.println(ch+" "+num);
    }
}