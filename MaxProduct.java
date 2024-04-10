import java.util.*;
class MaxProduct
{
    long product(int n)
    {
        if(n==2||n==3)
        {
            return (n-1);
        }
        long res=1;
        while(n>4)
        {
            n=n-3;
            res=res*3;
        }
        return res*n;
    }
    public static void main(String args[])
    {
        MaxProduct mx=new MaxProduct();
        System.out.println("Max product is: "+mx.product(8));
    }
}