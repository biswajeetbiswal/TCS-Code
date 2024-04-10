import java.util.*;
class RearrangeBinaryNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the first string: ");
        String s1=sc.next();
        System.out.println("Enter the secind string: ");
        String s2=sc.next();
        char arr1[]=s1.toCharArray();
        Arrays.sort(arr1);
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}