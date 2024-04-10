class Encryption
{
    public static void main(String args[])
    {
        String s="All the besZ";
        int key=1;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(ch==' ')
           {
               s1+=" ";
           }
           else if(ch>=65&&ch<=90)
           {
             if(ch+key>90)
            {
               int x=(ch+key)%90;
               x+=64;
               char ch1=(char)x;
               s1+=ch1;
            }
            else{
                s1+=(char)(ch+key);
            }
           }
           else
           {
             if(ch+key>122)
            {
              int x=(ch+key)%122;
              x+=96;
              char ch1=(char)x;
              s1+=ch1;
            }
            else{
                  s1+=(char)(ch+key);
            }
           }
        }
        System.out.println(s1);
    }
}
