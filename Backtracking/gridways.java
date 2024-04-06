import java.util.*;
public class gridways 
{
    static int count=0;
    public static int grid(int i,int j,int m,int n)
    {
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        else if(i==m || j==n)
        {
            return 0;
        }
       int w1=grid(i+1,j,m,n);
        int w2=grid(i,j+1,m,n);
        return w1+w2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ma[][]=new int[m][n];
        
        System.out.println(grid(0,0,m,n));
    }
}
