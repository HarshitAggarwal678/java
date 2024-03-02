public class searchinrotatedarray 
{
    public static int search(int a[],int tar,int si,int ei)
    {
        if(si>ei)
        return -1;
        int mid=si+(ei-si)/2;
        //line 1
        if(tar==a[mid])
        {
            return mid;
        }
        if(a[si]<=a[mid])
        {
            //left part on line 1
            if(a[si]<=tar && tar<=a[mid])
            {
                return search(a, tar, si, mid-1);
            }
            else
           return search(a, tar, mid+1, ei);
        }
        //on line 2
        else
        {
            // line 2 right part
            if(a[mid]<=tar && tar<=a[ei])
            return search(a,tar,mid+1,ei);
            else//complete left part
            return search(a, tar, si, mid-1);
        }
    }
    public static void main(String args[])
    {
        int a[]={4,5,6,7,0,1,2};
        System.out.println(search(a,3,0,a.length-1));
    }
}
