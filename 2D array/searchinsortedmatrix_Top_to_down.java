public class searchinsortedmatrix_Top_to_down
{
    public static boolean staircasesearch(int array[][],int key)
    {
        int row=0,col=array[0].length-1;
        while(row<array.length && col >=0)
        {
            if(key==array[row][col])
            {
                System.out.println("found ("+row+","+col+")");
                return true;
            }
            else if(key>array[row][col])
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String args[])
    {
        int array[][]={{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
        int key=50;
        staircasesearch(array,key);
    }
}
