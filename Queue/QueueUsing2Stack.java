import java.util.*;
public class QueueUsing2Stack {
    public static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        //add
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        //remove
        public static int remove()
        {
            if(s1.isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek()
        {
            if(s1.isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[])
    {
        Queue q=new Queue();
        q.add(0);
        q.add(1);
        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }
    }
}
