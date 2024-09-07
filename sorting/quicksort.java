public class quicksort
{
    public static void quick(int a[],int si,int ei)
    {
        if(si>=ei)
        return;
        int p=partition(a,si,ei);
        quick(a,si,p-1);
        quick(a,p+1,ei);
    }
    public static int partition(int a[],int si,int ei)
    {
        int i=si-1;
        int pivot=a[ei];
        for(int j=si;j<ei;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        i++;
        a[ei]=a[i]; 
        a[i]=pivot;
        return i;
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[]={3,2,4,1,-1,5,4}; 
        quick(a, 0, a.length-1);  
        print(a); 
    }
}