public class subset 
{
    public static void sub(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        sub(str,ans+str.charAt(i),i+1);//yes
        sub(str,ans,i+1);//no
    }
    public static void main(String args[])
    {
        String a="abc";
        sub(a,"",0);
    }
}
