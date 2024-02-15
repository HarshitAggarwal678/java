import java.util.*;
public class firststupper 
{
    public static String uper(String a)
    {
        StringBuilder b=new StringBuilder("");
        b.append(Character.toUpperCase(a.charAt(0)));
        for(int i=1;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                b.append(a.charAt(i));
                i++;
                b.append(Character.toUpperCase(a.charAt(i)));
            }
            else
            b.append(a.charAt(i));
        }
        return b.toString();
    }
    public static void main(String args[])
    {
        String a="i am harshit";
        System.out.println(uper(a));
    }
}
