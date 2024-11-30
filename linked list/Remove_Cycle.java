public class Remove_Cycle
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data)
    {
        Node newnode= new Node(data);
        size++;
        if(head==null)
        {
            head = tail = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data)
    {
        Node newnode= new Node(data);
        size++;
        if(head==null)
        {
            head = tail = newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(Node h)
    {
        Node temp=h;
        while(temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.print("null \n");

    }
    public void addMiddle(int ind,int data)
    {
        if(ind==0)
        {
            addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<ind-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        size--;
        head=head.next;
        return val;
    }
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev=head;
        int i=0;
        for (i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;//tail.next
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    // public int size()
    // {
    //     Node temp=head;
    //     if(head==null)
    //     {
    //         return 0;
    //     }
    //     int i=0;
    //     while(temp!=null)
    //     {
    //         temp=temp.next;
    //         i++;
    //     }
    //     return i;
    // }
    public void remove(Node h)
    {
        if (h==null)
        return;
        Node fast=h;
        Node slow=h;
        int c=0;
        while(fast.next!=null && fast!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow)
            {
                c=1;
                break;
            }
        }if (c==1){
        slow=h; 
        Node pre=null;
        while (slow!=fast) {
            slow=slow.next;
            pre=fast;
            fast=fast.next; 
        }
        pre.next=null;}
        else
        return;
    }
    public static void main(String args[])
    {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;
        Remove_Cycle l=new Remove_Cycle();
        l.remove(head);
        l.print(head);
    }
}
