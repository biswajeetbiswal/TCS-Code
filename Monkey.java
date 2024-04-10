import java.util.*;
class Monkey
{
    public static void main(String args[])
    {
        int monkey=20,k=2,m=3,banana=12,penauts=12;
        while(banana>=k)
        {
            banana=banana-k;
            monkey--;
        }
        while(penauts>=m)
        {
            penauts=penauts-m;
            monkey--;
        }
        if(banana>0||penauts>0)
        {
            monkey--;
        }
        System.out.println(monkey);
    }
}