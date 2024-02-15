
public class modulation 
{
    public static int mode(int n,int m,int i)
    {
        int ans=1;
        while(m>0)
        {
            if( (m&1) == 1)
            {
                ans=(ans*n)%i;
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
        int i=3;
        int ans=mode(n,m,i);
        System.out.println(ans);
    }   
}
