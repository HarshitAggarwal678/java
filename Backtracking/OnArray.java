public class OnArray 
{
    public static void change(int a[],int i,int val)
    {
        if(i==a.length){
            Print(a);
            return;
        }
        a[i]=val;
        change(a, i+1, val+1);
        a[i]=a[i]-2;
    }
    public static void Print(int a[])
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int a[]=new int[5];
        change(a, 0, 1);
        Print(a);

    }
}
