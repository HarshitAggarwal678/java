import java.util.*;
public class KthLevel 
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static void Kth(Node root,int k)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int c=1;
        while(!q.isEmpty())
        {
            Node cur=q.poll();
            if(cur==null)
            {
                c++;
                if(!q.isEmpty())
                {
                    q.add(null);
                }
                else{
                    break;
                }
            }
            else{
                if(c>k)
                {
                    break;
                }
                if(c==k)
                System.out.print(cur.data+" ");
                if(cur.left!=null)
                {
                    q.add(cur.left);
                }
                if(cur.right!=null)
                {
                    q.add(cur.right);
                }
            }
        }
    }
    public static void KTH(Node root,int l,int k)
    {
        if(root==null)
        {
            return;
        }
        if(l==k)
        {
            System.out.print(root.data+" ");
            return;
        }
        if (l>k)
        return;
        KTH(root.left,l+1,k);
        KTH(root.right,l+1,k);
    }
    public static void main(String args[])
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(7);
        root.right.left=new Node(6);
        Kth(root,3);
        System.out.println();
        KTH(root,1,2);
    }     
}
