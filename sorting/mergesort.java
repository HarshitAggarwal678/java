import java.util.*;
public class mergesort 
{
    public static void mergesor(int a[],int si,int ei)
    {
        if(si>=ei)
        return;
        int mid=si+(ei-si)/2;
        mergesor(a,si,mid);
        mergesor(a,mid+1,ei);
        merge(a,si,mid,ei);
    }
    public static void merge(int a[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(a[i]<a[j])
            {
                temp[k]=a[i];
                i++;
            }
            else
            {
                temp[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=a[i++];

        }
        while(j<=ei)
        {
            temp[k++]=a[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            a[i]=temp[k];
        }

    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String arg[])
    {
        int a[]={3,2,1,4,-2};
        mergesor(a, 0, a.length-1);
        print(a);
    }
}
