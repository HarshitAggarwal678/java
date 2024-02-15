import java.util.*;
public class trappingrainningwater 
{
    public static int trapwater(int array[])
    {
        int trap=0;
        int n=array.length;
        int left[]=new int[n];//left ke sare max bar ki height
        left[0]=array[0];//left ka 1st bar hi 1st ke liye max hoga
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],array[i]);//pehle ko dusre se compare karenge
        }
        int right[]=new int[n];//right side se har bar ke liye max height nikal lenge 
        right[n-1]=array[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],array[i]);// last ko 2nd last se compare
        }
        for(int i=0;i<n;i++)
        {
            int water=(Math.min(left[i], right[i])-array[i]);//now the main task min of each side - bar of that no.
            trap=water+trap;
        }
        return trap;
    }
    public static void main(String[] args)
    {
        int array[]={4,2,0,6,3,2,5};
        System.out.println(trapwater(array));
    }
}
