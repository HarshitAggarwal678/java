public class searchinsortedmatrixbottomtotop
{
    public static boolean staircasesearch(int array[][],int key)
    {
        int row=array.length-1,col=0;
        while(row>=0 && col <array[0].length)
        {
            if(key==array[row][col])
            {
                System.out.println("found ("+row+","+col+")");
                return true;
            }
            else if(key<array[row][col])
            {
                row--;
            }
            else
            {
                col++;
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
        int key=40;
        staircasesearch(array,key);
    }
}


