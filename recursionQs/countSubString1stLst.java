public class countSubString1stLst {
    public static int call(String str,int i,int j,int n)
    {
        if(n==1)
        return 1;
        if(n<1)
        return 0;
        int a=call(str,i+1,j,n-1);
        int b=call(str,i,j-1,n-1);
        int c=call(str,i+1,j-1,n-2);
        if(str.charAt(i)==str.charAt(j))
            return a+b+1-c;
        else
        return a+b-c;
    }
public static void main(String args[])
{
    String a="abca";
    int n=a.length();
    System.out.print(call(a,0,n-1,n));
}    
}
