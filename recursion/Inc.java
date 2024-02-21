public class Inc 
{
    public static int inc(int n)
    {
        if (n==0)
        {
            return 0;
        }
        inc(n-1);
        System.out.print(n+" ");
        return 0;
    }
    public static void main(String args[])
    {
        inc(5);
    }
}
