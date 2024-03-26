public class subBuilder 
{
    public static void sub(String str,StringBuilder ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        ans.append(str.charAt(i));
        sub(str,ans,i+1);//yes
        ans.deleteCharAt(ans.length()-1);
        sub(str,ans,i+1);//no
    }
    public static void main(String args[])
    {
        String a="abc";
        sub(a,new StringBuilder(),0);
    }
}
