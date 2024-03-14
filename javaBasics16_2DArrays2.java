/*
*  Diagonal sum of Matrix : 4*4 Matrix
        primary diagonal :  (0,0) + (1,1) + (2,2) + (3,3) --> {i == j}
        secondary diagonal :  (0,3) + (1,2) + (2,1) + (3,0)  --> i+j = n-1  // i= i+1 & j = j-1

* Search in Sorted Matrix : 
                M-1 : Brute force --  O(n^2)
                M-2 : Row wise sorted -- O(nlogn)
                M-3 : StairCase Search

      input:    10   20   30__40     key : 33
                15   25___35| 45     Apply staircase search   
                27   29|  37  48
                32   33| 39   50
    * How we have tp move in directions (comparing key value with cell value)
             (n-1,0)                |       (0,m-1)
             key < cell value       |     key < cell value
               Top                  |        Left
             key  > cell value      |     key < cell value
               Right                |        Down


     *if i = 0 to n-1
         j = m-1 to 0   reaching from one end to the other then our key not exist.
*/


public class javaBasics16_2DArrays2 
{
    //* Diagonal sum of Matrix
    // *Method 1 - O(n^2)
   /* public static int diagonalSum(int matrix[][])
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if(i == j) 
                {
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1)
                {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    } */

    //* Method 2 - O(n)
    public static int diagonalSum(int[][] matrix)
    {
        int sum =0;
        for(int i = 0; i < matrix.length; i++)
        {
        // pd
        sum += matrix[i][i];
        //sd
        if(i != matrix.length-i-1)
        {
            sum += matrix[i][matrix.length-i-1];
        }
        }
        return sum;

    }

    //* Search in Sorted Matrix o(n+m)
    public static boolean staircaseSearch(int[][] matrix, int key)
    {
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("key found at index("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col])
            {
                col--; 
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }



    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int x= diagonalSum(matrix);
        System.out.println("Diagonal Sum = "+x);

        int key = 1;
        staircaseSearch(matrix, key);
    }
}
