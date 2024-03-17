/*
* 2-D Arrays -- (2 Dimentional arrays) -- array of arrays
           matrix representation in the form of rows and columns.(x-y)axes
           abstract view and memory view

           real life Example: store marks of 5 students of 3 different.
                    example: store images -- RGB matrix (3-D array)
                    example: video store (4-D array) {RGB + time}

       * similarly 3-D Arrays -- (3 Dimentional arrays) eg: cube
            4-D Arrays, 5-D Arrays....n-D Arrays
            n-D Arrays: Machine Learning    

        * Representation of Arrays -- Matrix -- rows (horizontal) and columns(vertical).
                       *(total cells = row*column)
                       *(data entered row wise)

        * 2D Arrays in Memory -- row major (row wise storege) like row 1 , row 2, row 3, ...
                             -- Column major (column wise storege) like column 1 , column 2,...
                    *But in java there is noting like row major or column major.

                        Stack    |     Heap  [1K, 2K,3k]
                         |   |   |  1k  -->   arr1
                         | 4k|   |  2k  -->   arr2
                         |___|   |  3k  -->   arr3
                    *Arrays are stored(may be contigous) in linear Array(created seperately of same size) but address not same or contigous
                                       
*/
import java.util.*;
import java.util.Scanner;

public class javaBasics16_2DArrays {
    
    // Search 
    public static boolean search(int matrix[][], int key)
    {
        for(int i=0; i < matrix.length; i++)
        {
            for(int j=0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("Key found at cell(" +i+ "," +j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // 2-D Arrays
        int n = matrix.length, m=matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements= ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}
