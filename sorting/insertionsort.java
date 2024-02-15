public class insertionsort 
{
    public static void insertion(int array[])
    {
        for(int i=1;i<array.length;i++)
        {
            int curr=array[i];
            int pre=i-1;
            while(pre>=0 && array[pre]>curr)// pehle hath me kuch hona chahiye
            {                               // badme agar hath vala(previous) bada h previous ke next                                            
                array[pre+1]=array[pre];    // ko bhi previous bna denge and previous se bhi pehle ko check karenge
                pre--;
            }
            array[pre+1]=curr;//is waqt ya to pre -ve hoga ya cur se just km hoga kyo ki cur=pre+1(pre=i-1) h
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
        int array[]={1,3,2,5,4};
        insertion(array);
        printing(array);
    }
}
