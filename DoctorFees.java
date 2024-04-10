import java.util.*;
class DoctorFees{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n,result=0,count=0,flag=0;
        while(true)
        {
            try {
             n=sc.nextInt(); 
             count++;
            }
            catch(NoSuchElementException e)
            {
               break; 
            }
            if(n<=0||n>120||count>20)
            {
                flag=1;
                break;
            }
            else{
                if(n<=17)
                {
                    result+=200;
                }
                else if((n>17)&&(n<=40))
                {
                    result+=400;
                }
                else
                {
                    result+=300;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Invalid input");
        }
        else{
            System.out.println(result);
        }
    }
}