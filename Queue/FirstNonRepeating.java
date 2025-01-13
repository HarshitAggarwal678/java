import java.util.*;
public class FirstNonRepeating 
{
 public static void Nonrepeating(String str)
 {
    Queue<Character> q=new LinkedList<>();
    int fre[]=new int[26];
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        q.add(ch);
        fre[ch-'a']++;
        while(!q.isEmpty() && fre[q.peek()-'a']>1)
        {
            q.remove();
        }
        if(q.isEmpty())
        {
            System.out.print(-1+" ");
        }
        else
        System.out.print(q.peek()+" ");
    }
 } 
 public static void main(String args[])
 {
    String s="aabccxb";
    Nonrepeating(s);
 }  
}
