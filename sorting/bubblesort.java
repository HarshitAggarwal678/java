import java.util.*;
public class bubblesort {
    public static void bubble(int array[])
    {
        for(int i=0;i<array.length-1;i++)// -1 isliye h kyo ki last vale ko kisi se check nahi 
        {                                // karenge 
            int swap=0;
            for (int j=0;j<array.length-1-i;j++)//ab -i isliye kyo ki last me already sorted h
            {
                if(array[j]>array[j+1])
                {
                    swap++;
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            if(swap==0)
                {
                    break;
                }
        }
    }
    public static void printing(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int array[]={1,5,3,2,4};
        bubble(array);
        printing(array);
    }
    
}

