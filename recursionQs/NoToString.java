public class NoToString {
    static String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void all(int num)
    {
        if(num==0)
        {
            return;
        }
        int last=num%10;
        all(num/10);
        System.out.print(s[last]+" ");
    }
public static void main(String args[])
{
    int a=1947;
    all(a);
}   

    
}
