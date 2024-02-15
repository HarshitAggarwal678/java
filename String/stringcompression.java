import java.util.*;
public class stringcompression 
{
    public static String comp(String str)
    {
        StringBuilder a= new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            a.append(str.charAt(i));
            if(count>1)
            {
                a.append(count.toString());
            }
        }
        return a.toString();
    }
    public static void main(String args[])
    {
        String a;
        Scanner obj=new Scanner(System.in);
        a=obj.nextLine();
        System.out.println(comp(a));
        
    }
}
