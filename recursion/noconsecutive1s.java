public class noconsecutive1s 
{
    public static void no1s(int n,String str,int last)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        no1s(n-1,str+"0",0);
        if(last==0)
            no1s(n-1,str+"1",1);
    }
    public static void main(String args[])
    {
        no1s(3,"",0);
    }
}
