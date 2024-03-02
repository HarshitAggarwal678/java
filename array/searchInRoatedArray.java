import java.util.*;
public class searchInRoatedArray 
{
    public static void main(String args[])
    {
        int a[]={4,5,6,7,0,1,2};
        int si=0;
        int ei=a.length-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target");
        int tar=sc.nextInt();
        while(si<=ei)
        {
            int mid=si+(ei-si)/2;
            if(a[mid]==tar)
            {System.out.println(mid);
            return;}
            if(a[si]<=a[mid])
            {
                if(a[si]<=tar && tar<=a[mid])
                {
                    ei=mid-1;
                }
                else
                si=mid+1;
            }
            else
            {
                if(a[mid]<=tar && tar<=a[ei])
                {
                    si=mid+1;
                }
                else
                ei=mid-1;
            }
        }
        System.out.println(-1);
    }
}
