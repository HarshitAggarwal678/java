import java.util.*;
public class vowelcount 
{
    public static int counter(String a)
    {
       int b=0;
       for(int i=0;i<a.length();i++)
       {
        if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
        b++;
       }
       return b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.nextLine();
        System.out.println(counter(a));
    }
}
