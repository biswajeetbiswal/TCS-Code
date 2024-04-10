import java.util.*;
class Vehicle
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of vehicle:");
      int v=sc.nextInt();
      System.out.println("Enter no. of wheel:");
      int w=sc.nextInt();
    //   int i=1,j=v-1;
    //   while(2*i+4*j!=w)
    //   {
    //       i++;
    //       j--;
    //   }
    //   System.out.println("2 whillers:"+i+" 4 whillers:"+j);
    float res=((4*v)-w)/2;
    if(w>=2&& w%2==0&&v<w){
    System.out.println("2 whillers:"+(int)res+" 4 whillers"+(int)(v-res));}
    }
}