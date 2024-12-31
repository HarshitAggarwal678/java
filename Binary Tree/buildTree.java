import java.util.*;
public class buildTree 
{
    static class Node{
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
    static class binaryTree
    {
        static  int inx = -1;
        public static Node buildTre(int node[])
            {
                inx++;
                if(node[inx]==-1)
                return null;
                Node newNode=new Node(node[inx]);
                newNode.left=buildTre(node);
                newNode.right=buildTre(node);
                return newNode;
            }
        public static void preOrder(Node root)
        {
            if (root==null){
               // System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root)
        {
            if (root==null){
               // System.out.print(-1+" ");
                return;
            }           
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }
    }
    public static void main(String args[])
    {
        binaryTree tree=new binaryTree();
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=tree.buildTre(node);
        System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
    }
}
