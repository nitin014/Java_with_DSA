
/*
 * Spiral Matrix:
                 Approach =  top    {sc - ec}
                             right  {sr+1 - er}
                             bottom {ec-1 - sc}
                             left   {er-1 - sr+1}

 
 input - 1  2  3  4       output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
         5  6  7  8            
         9  10 11 12
         13 14 15 16
 */

//import javax.sql.rowset.spi.SyncResolver;

public class javaBasics16_2DArrays1 {

    public static void spiralMatrix(int matrix[][])
    {
        int startRow = 0; 
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) // make it run for both n*n and n*m matrix
        {
        //top
        for (int j = startCol; j <=endCol; j++)
        {
            System.out.print(matrix[startRow][j]+" ");
        }
        //right
        for (int i = startRow+1; i <= endRow; i++)
        {
            System.out.print(matrix[i][endCol]+" ");
        }
        //bottom
        for(int j = endCol-1; j>=startCol; j--) 
        {
            // check repeation
            if(startRow == endRow){ 
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }
        //left
        for(int i = endRow-1; i>=startRow+1; i--)
        {
            if(startCol == endCol){
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
        }

        startCol++;
        startRow++;
        endCol--;
        endRow--;
    }
    
    System.out.println();
}
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(matrix);
    }
}
