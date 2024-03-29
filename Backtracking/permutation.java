public class permutation 
{
    public static void per(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char cur=str.charAt(i);
            String news=str.substring(0, i)+str.substring(i+1);
            per(news,ans+cur);
        }
    }
    public static void main(String args[])
    {
        String a="abc";
        per(a,"");
        
    }
}
