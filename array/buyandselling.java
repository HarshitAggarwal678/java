import java.util.*;
public class buyandselling 
{
    public static int profit(int array[])
    {
        int prof=0;
        int buy=array[0];//pehle stock ke liye koi sasta ya mehnga nahi hoga
        for(int i=1;i<array.length;i++)
        {
            if(buy<array[i])// agar dusra mehnga h to profit verna dusre ke price per khareed lenge
            {
                int p=array[i]-buy;
                prof=Math.max(p,prof);
            }
            else
            buy=array[i];
        }
        return prof;
    }
    public static void main(String args[])
    {
        int array[]={1,6,5,3,4};
        System.out.println(profit(array));
    }
}
