import java.util.*;
public class LevelOrder 
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
                public static void Level(Node root)
                {
                    Queue<Node> q=new LinkedList<>();
                    q.add(root);
                    q.add(null);
                    while(!q.isEmpty())
                    {
                        Node newNode=q.remove();
                        if(newNode==null)
                        {
                            System.out.println();
                            if(!q.isEmpty())
                            q.add(null);
                            else
                            break;
                        }
                        else{
                            System.out.print(newNode.data+" ");
                            if(newNode.left!=null)
                            {
                                q.add(newNode.left);
                            }
                            if(newNode.right!=null)
                            {
                                q.add(newNode.right);
                            }
                        }
                    }
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
            tree.Level(root);
        }
    }
       

