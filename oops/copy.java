public class copy
{
    public static void main(String arg[])
    {
        buy b1=new buy();
        b1.a=2;
        b1.b="harsh";
        b1.marks[0]=1;
        buy b2=new buy(b1);
        b1.a=33;
        b1.b="harshit";
        b1.marks[0]=4;
        System.out.println(b2.a);
        System.out.println(b2.b);
        System.out.println(b2.marks[0]);
    }
}
class  buy
{
    int a;
    String b;
    int marks[];

    buy()
    {
        marks=new int[2];
    }
    buy(buy s1)
    {
        marks =new int[2];
        this.a=s1.a;
        this.b=s1.b;
        this.marks=s1.marks;
    }
}
