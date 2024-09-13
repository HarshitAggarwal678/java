public class elementArray 
{
    public static void all(int arr[],int i,int target)
    {
        if(i==arr.length)
        {
            return;
        }
        if(arr[i]==target)
        {
            System.out.print(i);
        }
        all(arr,i+1,target);
    }
public static void main(String args[])
{
    int arr[]={3,2,4,5,6,2,7,2,2};
    all(arr,0,2);
}   
}
