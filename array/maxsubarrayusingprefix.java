public class maxsubarrayusingprefix {
    public static void Subarray(int array[])
    {
        int max=Integer.MIN_VALUE;
        int prefixarray[]=new int[array.length];
        prefixarray[0]=array[0];
        for(int i=1; i<array.length;i++)
        {
            prefixarray[i]=prefixarray[i-1]+array[i];
        }
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {   
                int sum= i==0 ? prefixarray[j] : prefixarray[j]-prefixarray[i-1];
                if(max<sum)
                max=sum;
            }
        }
        System.out.println("max="+max);
    }
    public static void main(String args[])
    {
        int arr[]={1,-2,6,-1,3};
        Subarray(arr);
    }
}

    

