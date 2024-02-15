public class substring 
{
    public static String sub(String str,int s,int e)
    {
        String su="";
        for(int i=s;i<e;i++)
        {
            su+=str.charAt(i);
        }
        return su;
    }
    public static void main(String args[])
    {
        String str="HelloWorld";
        System.out.println(sub(str,0,5));//ending index -1 hota h like origianlly 0-4 
       // System.out.println(str.substring(0, 5));
    }    
}
