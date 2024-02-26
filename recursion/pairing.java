import java.util.*;
public class pairing 
{
    public static int pair(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        //single
        int fnm1=pair(n-1);
        int fnm2=pair(n-2);//pair
        int ways=(n-1)*fnm2;
        return fnm1+ways;//total no. of ways
    }
    public static void main(String args[])
    {
        System.out.println(pair(3));
    }
}
