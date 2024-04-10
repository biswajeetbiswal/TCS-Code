import java.util.*;
import java.math.BigInteger;
class RoundTable
{
    BigInteger factorial(int num)
    {
        BigInteger res=BigInteger.ONE;
        for(int i=num;i>1;i--)
        {
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String args[])
    {
        RoundTable rt=new RoundTable();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of candidate: ");
        int n=sc.nextInt();
        BigInteger res=rt.factorial(n-1);
        System.out.println(res.multiply(BigInteger.valueOf(2)));
    }
}