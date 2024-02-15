import java.util.*;
public class diagonalsum {
    public static void sume(int array[][])
    {
        int n=array.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=array[i][i];
            if(i!=n-1-i)//so that middle value don't get repeat in case of odd 
            sum+=array[i][n-1-i];
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter no.rows");
        int n=obj.nextInt();
        System.out.println("enter no.columns");
        int m=obj.nextInt();
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=obj.nextInt();
            }
        }
        sume(array);
    }
}
