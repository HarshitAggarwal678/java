public class spiralanticlockwise 
{
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            //top
            for(int i=endcol;i>=startcol;i--)
            {
                System.out.print(matrix[startrow][i]+" ");
            }
            //left
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(matrix[i][startcol]+" ");
            }
            //bottom
            for(int i=startcol+1;i<=endcol;i++)
            {
                if(startrow==endrow)
                {break;}
                System.out.print(matrix[endrow][i]+" ");
            }
            //right
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol==endcol)
                {break;}
                System.out.print(matrix[i][endcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    } 
}
