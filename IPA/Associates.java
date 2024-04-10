import java.util.*;
class Associates
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. associates:");
        int n=sc.nextInt();
        sc.nextLine();
        Data da[]=new Data[n];
        System.out.println("Enter all the details:");
        for(int i=0;i<da.length;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            double b=sc.nextDouble();
            int c=sc.nextInt();
            sc.nextLine();
            da[i]=new Data(a,s,b,c);
        }
        System.out.println("Enter the score for matching:");
        double m=sc.nextDouble();

        Data user1=showAssociatedByScores(da,m);
        if(user1==null)
        {
            System.out.println("No associate is found");
        }
        else{
            System.out.println(user1.getId());
            System.out.println(user1.getName());
        }

        int user2=findAssociationWithMaxExperience(da);
        System.out.println(user2);
    }

    public static Data showAssociatedByScores(Data []da, double m)
    {
        for(int i=0;i<da.length;i++)
        {
            if((da[i].getScore())==m)
            {
                return da[i];
            }
        }
        return null;
    }

    public static int findAssociationWithMaxExperience(Data []da)
    {
        int max=da[0].getExperience();
        for(int i=1;i<da.length;i++)
        {
            if(da[i].getExperience()>max)
            {
                max=da[i].getExperience();
            }
        }
        return max;
    }
}

class Data
{
    private int id;
    private String name;
    private double score;
    private int experience;

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getScore()
    {
        return score;
    }

    public int getExperience()
    {
        return experience;
    }

    public Data(int id,String name,double score,int experience)
    {
        this.id=id;
        this.name=name;
        this.score=score;
        this.experience=experience;
    }
}