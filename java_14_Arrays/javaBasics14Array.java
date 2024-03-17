
/*  Array is a list of elements of same type(data type) 
    palced in contiguous memory location.
     (store same type of data) like int, sring, float, double..
     
     [ 1,   2,   3,   4,    5 ] -> Array
      100  104  108  112  116   -> location (contigous memory location) // int(4 byte)
     
      ['a',   'b', '  c']
       101    102     103 -> location (contigous memory location) // char(1 byte)

    *Operations in Arrays
      create, input, output, update    

      create ->
                dataType arrayName[] = new dataType[size];
        
        int marks[] = new int[10];
        int number[] = {1, 2, 3}; 
        String cityName[] = {"Delhi", "Kolkata", "Mumbai"};

        * size of array is static (can't be changed during runtime)

        *Passing arrays as argument
           -> pass by value (not in array)
           -> pass by reference (arrays passed by reference)
*/

//import javax.xml.crypto.Data;
import java.util.*;
public class javaBasics14Array {
    public static void update(int marks[])
    {
         for (int i = 0; i < marks.length; i++)
         {
             marks[i] = marks[i] + 1;
         }
    }

    /*Linear search - What is meant by linear search?  O(n)
                        Linear Search is defined as a sequential search algorithm that starts at one end and goes through each element of 
                        a list until the desired element is found, otherwise the search continues till the end of the data set.*/
    public static int linearSearch(int num[], int key)
    {
        for (int i = 0; i < num.length; i++)
        {
            if(num[i] == key)
            {
                return i;
            }
        }
        return -1; // key not found
    }

    // Get largest value and smallest value  O(n)
    public static int getLargest(int arr[])
    {
        int max = Integer.MIN_VALUE; // -infinity
        int min = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest value is = " + min);
        return max;
    }

    /* Binary Search: Binary Search is defined as a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. 
                     The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N). */
    public static int binarySearch(int arr2[] ,int key2)
    {
        int start =0;
        int end = arr2.length - 1;
        
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            //comparisions
            if(arr2[mid] == key2)
            {
                return mid;
            }
            if(arr2[mid] < key2)
            {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        //int marks[] = new int[10];
        int marks[] = {97, 98, 99};
        update(marks);
        // print marks[] to screen
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i]+" "); 
        }
        System.out.println();

        // linear
        int num[] = {2,4,6,7,8,10,12,16};
        int key=10;
        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
        System.out.println("Key is at index " +index);
        }

        // largest
        int arr[] = {4,3,8,7,9,5,2};
        System.out.println("largest value is = " +getLargest(arr));

        //binary search
        int arr2[] = {2, 3, 5, 8, 12, 15, 22};
        int key2 = 2;
        System.out.println("index for key B_Search = "+binarySearch(arr2,key2));

    }
}
 
/*
        
              Linear Search                                                                           Binary Search

    In linear search input data need not to be in sorted.	                      In binary search input data need to be in sorted order.
    It is also called sequential search.	                                      It is also called half-interval search.
    The time complexity of linear search O(n). 	                                  The time complexity of binary search O(log n).
    Multidimensional array can be used.	                                          Only single dimensional array is used.
    Linear search performs equality comparisons	                                  Binary search performs ordering comparisons
    It is less complex.	                                                          It is more complex.
    It is very slow process.	                                                  It is very fast process.
 */