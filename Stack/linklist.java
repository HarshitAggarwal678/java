import java.util.LinkedList;
public class linklist 
{
    static class stack{
         LinkedList<Integer> list=new LinkedList<>();
        public  boolean isEmpty()
        {
            return list.size()==0;
        }
         void push(int data)
        {
            list.add(data);
        }
         int pop()
        {
            if (isEmpty())
            {
                return -1;
            }
            int d=list.get(list.size()-1);
            list.remove(list.size()-1);
            return d;
        }
         int peek()
        {
            if (isEmpty())
            {
                return -1;
            }
            int d=list.get(list.size()-1);
            return d;
        }
    }
    public static void main(String args[])
    {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        stack ss=new stack();
        ss.push(4);
        ss.push(1);
        ss.push(8);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.pop());
    }
}
