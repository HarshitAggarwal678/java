public class palindrome
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
    public Node middle(Node h){
        Node slow=h;
        Node fast=h;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reverse(Node slow)
    {
        Node cur=slow;
        Node pre=null;
        Node next;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }

    }
    public boolean Palindrome(Node h)
    {
        if(h==null|| h.next==null)
        return true; 
        Node mid=middle(h);
        reverse(mid);
        Node s=h;
        Node e=tail;
        while(e!=null){
            if(s.data==e.data){
                s=s.next;
                e=e.next;
            }
            else
            return false;
        }
        return true;
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
        palindrome l= new palindrome();
        l.addfirst(1);
        l.addfirst(2);
        l.addfirst(2);
        l.addfirst(1);
        if (l.Palindrome(head)){
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    }
}
