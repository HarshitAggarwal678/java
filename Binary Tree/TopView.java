import java.util.*;
public class TopView 
{
public static class Node{
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
public static class Info{
    Node node;
    int hd;
    Info(Node node,int hd)
    {
        this.node=node;
        this.hd=hd;
    }
}
public static void Top(Node root)
{
    Queue<Info> q=new LinkedList<>();
    HashMap<Integer,Node> m=new HashMap<>();
    q.add(new Info(root,0));
    q.add(null);
    int min=0,max=0;
    while(!q.isEmpty())
    {
        Info cur=q.poll();
        if(cur==null)
        {
            if(!q.isEmpty())
            {
                q.add(null);
            }
            else
            break;
        }
        else{
            if(!m.containsKey(cur.hd)){
                m.put(cur.hd,cur.node);
            }
            if(cur.node.left!=null)
            {
                q.add(new Info(cur.node.left, cur.hd-1));
                min=Math.min(min,cur.hd-1);
            }
            if(cur.node.right!=null)
            {
                q.add(new Info(cur.node.right,cur.hd+1));
                max=Math.max(max,cur.hd+1);
            }
        }
    }
    for(int i=min;i<=max;i++)
    {
        System.out.print(m.get(i).data+" ");
    }
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
    Top(root);
}    
}
