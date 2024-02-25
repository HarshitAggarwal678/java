import java.util.*;
public class DuplicateInString 
{
    public static void remove(String str,int ind,StringBuilder newstr,boolean arr[])
    {

        if(ind==str.length())
        {
            System.out.println(newstr);
            return;
        }
        char a=str.charAt(ind);
        if(arr[a-'a']==true)
        {
            remove(str,ind+1,newstr,arr);
        }
        else{
            arr[a-'a']=true;
            remove(str,ind+1,newstr.append(a),arr);
        }
    }
    public static void main(String args[])
    {
        String a="appnnacollege";
        remove(a,0,new StringBuilder(""),new boolean[26]);
    }
}
