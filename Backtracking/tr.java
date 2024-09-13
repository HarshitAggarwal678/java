public class tr 
{
    public static void recur(int a[],int i)
    {
        if(a[a.length-1]!=0){
            print(a);
            return;
        }
        a[i]=i+1;
        recur(a,i+1);
        a[i]-=2;
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int a[]=new int[5];
        recur(a,0);
        print(a);
    }
}
