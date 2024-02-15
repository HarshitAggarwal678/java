public class exponentiation 
{
    public static int mode(int n,int m)
    {
        int ans=1;
        while(m>0)
        {
            if( (m&1) == 1)
            {
                ans=ans*n;
            }
            m=m>>1;
            n=n*n;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int n=2;
        int m=3;
        int ans=mode(n,m);
        System.out.println(ans);
    }
}
