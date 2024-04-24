public class Sudoku 
{
    public static boolean sudok(int sudoku[][],int row,int col)
    {
        //base condition
        if(row==9)
        return true;
        // recursion
        int nextrow=row,nextcol=col+1;
        if(nextcol==9)
        {
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0)
        return sudok(sudoku,nextrow,nextcol);
        
        for(int i=1;i<=9;i++)
        {
            if(safe(sudoku,row,col,i))
            {
                sudoku[row][col]=i;
                if(sudok(sudoku,nextrow,nextcol))
                return true;
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean safe(int sudoku[][],int row,int col,int digit)
    {
        for(int i=0;i<9;i++)
        {
            if(sudoku[row][i]==digit)
            return false;
        }
        for(int i=0;i<9;i++)
        {
            if(sudoku[i][col]==digit)
            return false;
        }
        row=(row/3)*3;
        col=(col/3)*3;
        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                if(sudoku[i][j]==digit)
            return false;
            }
        }
        return true;
    }
    public static void print(int sudoku[][])
    {
        for(int i=0;i<9;i++)
        {
            for (int j=0;j<9;j++)
            {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        if(sudok(sudoku, 0, 0))
        {
            System.out.println("Solution exist");
            print(sudoku);
        }
        else
        System.out.println("Solution does not exist");
    }
}
