public class lastoccurance 
{
    public static int last(int array[],int key,int i)
    {
        if(i==-1){
            return i;
        }
        if(key==array[i])
        {
            return i;
        }
        return last(array,key,i-1);
    }
    public static void main(String args[])
    {
        int ar[]={1,2,3,4,5};
        System.out.println(last(ar,5,ar.length-1));
    }
}
