import java.util.*;
public class Creation{
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
    public static Node Insert(Node root,int value)
    {
        if(root==null)
        {
            root=new Node(value);
            return root;
        }
        if(root.data>value){
            root.left=Insert(root.left,value);
        }
        else
        root.right=Insert(root.right,value);
        return root;
    }
    public static void inOrder(Node root)
    {
        if(root==null)
        return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String args[])
    {
        int values[]={3,2,5,1,4};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=Insert(root,values[i]);
        }
        inOrder(root);
    }
    
}