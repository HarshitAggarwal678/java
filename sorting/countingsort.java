public class countingsort 
{
    public static void counting(int array[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            max=array[i];
        }
        int count[]=new int[max+1];
        for(int i=0;i<array.length;i++)
        {
            count[array[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printing(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
    }
    public static void main(String args[])
    {
        int array[]={1,3,2,5,4,0};
        counting(array);
        printing(array);
    }    
}
