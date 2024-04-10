import java.util.*;
class Ballons
{
    public static void main(String args[])
    {
    char arr[]={'a','b','b','b','c','c','c','a','f','c'};
    String s=new String(arr);
    HashMap<Character,Integer>map=new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
        if(map.containsKey(arr[i]))
        {
            int count=map.get(arr[i]);
            map.put(arr[i],++count);
        }
        else{
            map.put(arr[i],1);
        }
    }
    char ch='0';int index=Integer.MAX_VALUE;
    for(Map.Entry<Character,Integer>e:map.entrySet())
    {
        if(e.getValue()%2!=0)
        {
            if(index>s.indexOf(e.getKey()))
            {
                index=s.indexOf(e.getKey());
                ch=e.getKey();
            }
        }
    }
    System.out.println(ch);
    
    }
}