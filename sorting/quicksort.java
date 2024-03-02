public class quicksort 
{
    public static void quick(int a[],int si,int ei)
    {
        if(si>=ei)
        return;
        int b=partition(a,si,ei);
        quick(a,si,b-1);
        quick(a,b+1,ei);
    }
    public static int partition(int a[],int si,int ei)
    {
        int piviot=a[ei];
        int i=-1;
        int j=0;
        while(j<=ei)
        {
            if(a[j]<piviot)
            {
                int temp=a[j];
                i++;
                a[j]=a[i];
                a[i]=temp;
            }
            j++;
        }
        i++;
        int temp=a[i];
        a[i]=piviot;
        a[ei]=temp;
        return i;
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        int a[]={2,1,3,5,4,-1};
        quick(a, 0, a.length-1);
        print(a);
    }
}
