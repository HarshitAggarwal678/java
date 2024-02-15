import java.util.*;
public class oddeven 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=1;
        if ((a & n) ==1)
        {
            System.out.println("odd");
        }
        else
        System.out.println("even");
    }
}
