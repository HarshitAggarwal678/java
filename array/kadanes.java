import java.util.*;
public class kadanes 
{
    public static void Subarray(int array[])
    {
        int max=Integer.MIN_VALUE;
        int cs=0;
        int con=-1;
        int co=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>0)//-1,-2,-6,-3
            {
                con=0;
            }
            cs=cs+array[i];
            if(cs<0)
            {
                cs=0;
            }
            max=Math.max(cs,max);
            if(co<array[i])//if all no. are -ve then the largest -ve no. 
            {              //is the largest subarray 
                co=array[i];
            }
        }
        if(con==0)
        System.out.println(max);
        else 
        System.out.println(co);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,-10,4,5};
        Subarray(arr);
    }
}
