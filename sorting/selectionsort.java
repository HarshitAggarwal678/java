import java.util.*;
public class selectionsort 
{
    public static void selection(int array[])
    {
        int min=0;
        for(int i=0;i<array.length-1;i++)
        {
          min=i;
          for(int j=i+1;j<array.length;j++)
          {
            if(array[min]>array[j])
                min=j;
          }  
          int temp = array[min];
          array[min]=array[i];
          array[i]=temp;
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
        int array[]={1,2,3,4,5};
        selection(array);
        printing(array);
    }
}
