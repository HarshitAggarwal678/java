import java.util.*;
public class NQueenCount 
{
    static int count=0;
    public static void queen(char board[][],int row)
    {
        if(row==board.length)
        {
            // print(board);
            count++;
            return;
        }
        for(int i=0;i<board[0].length;i++)
        {
            if(verify(board, row, i)){
            board[row][i]='Q';
            queen(board,row+1);
            board[row][i]='.';
            }
        }
    }
    public static boolean verify(char board[][],int row,int col)
    {
        //left upper diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            return false;
        }
        //upper direction
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            return false;
        }
        //right upper diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++)
        {
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }
    public static void print(char board[][])
    {
        System.out.println("--------Chess Board---------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                board[i][j]='.';
            }
        }
        queen(board,0);
        System.out.println(count);
    }

}
