import java.util.*;
public class printsubarray {
    public static void rever(int a[],int n)
    {
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }  
    }
    public static void main(String args[])
    {
        System.out.println("enter the array no.");
        Scanner sc= new Scanner(System.in);
        int array[]=new int[10];
        for (int i=0;i<=9;i++)
        {
            array[i]=sc.nextInt();
        }
        for (int i=0;i<10;i++)
        {
            for(int j=i;j<10;j++)
            {
                for (int k=i;k<=j;k++)
                {
                    System.out.print(array[k]+",");
                }
                System.out.println();
            }
        }
    }
    


    
}
