import java.util.*;
public class  palindrome
{public static boolean palin(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                System.out.println("No");
                return false;
            }
        }
        System.out.println("Yes");
        return true;
    }

    public static void main(String args[])
    {
        String str="abba";
        palin(str);
    }
}