public class linkedlist 
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
    public void print()
    {
        Node temp=head;
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
    public static void main(String args[])
    {
        linkedlist l= new linkedlist();
        l.addfirst(3);
        l.addfirst(2);
        l.addfirst(1);
        l.addLast(4);
        l.addMiddle(4,5);
        l.print();
        l.removeFirst();
        l.print();
        l.removeLast();
        l.print();
        System.out.println(size);
    }
}
