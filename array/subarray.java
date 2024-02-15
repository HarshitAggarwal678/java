import java.util.*;
public class subarray
{
    public static void Subarray(int array[])
    {   
        int start=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<array.length;i++)
        {
            
            for(int j=i;j<array.length;j++)
            {   
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(array[k]+" ");
                    sum=sum+array[k];
                }
                if(min>sum)
                min=sum;
                if(max<sum)
                max=sum;
                start++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(start);
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
    public static void main(String args[])
    {
        int arr[]={1,-2,6,-1,3};
        Subarray(arr);
    }
}
