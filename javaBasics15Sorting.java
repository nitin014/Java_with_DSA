/*
*Sorting -- Arranging elements in a particular order either in ascending order or descending order.
         -- Used to optimize the operations we perform.
         -- check for duplicates, find minimum and maximum values(in large data sets).

        comparision based -- bubble , selection, insertion,
        non-comparison based -- counting sort
        swapping -- inversion count
        

  * Bubble Sort O(n^2) -- Large elements come to the end of the array by swapping with the adjacent elements.
       
       *  How to optimize bublle sort for O(n) t.c
              use boolean variable to check swapping occured after first iteration , 
              if no swapping occured, it means array already sorted.(skip remaining passes).

 
  * Selection sort  -- pick the smallest element from unsorted array, and put it in beginning.
                     divide list into two parts -sorted and unsorted 
                     sorted (empty initially) and unsorted(contains entire list)
                     now smallest element from unsorted moves to sorted 
                     until unsorted(empty) and sorted(full).
  */

public class javaBasics15Sorting {

       //* Bubble Sort 
       public static void bubbleSort(int arr[]) // O(n) optimized
       {
              //for (int i = arr.length-1; i>=0; i--) // (Method-2)
              for(int i=0; i<arr.length-1; i++) // n times
              {
                     boolean swapped = false;
                     //for(int j = 0 ; j < i ; j++) // (Method-2)
                     for(int j=0; j<arr.length-1-i; j++) // n-1-i times
                     {
                            if(arr[j] > arr[j+1])
                            {
                                   //swap
                                   int temp = arr[j];
                                   arr[j] = arr[j+1];
                                   arr[j+1] = temp;
                                   swapped = true;
                            }
                     }
                     if(!swapped)
                     break;
              }
       }
       public static void printBubble(int[] arr)
       {
              System.out.print("BubbleSort = ");
              for (int i = 0; i < arr.length; i++)
              {
                     System.out.print(arr[i]+" ");
              }
              System.out.println();
       }

       // * Selection Sort
       public static void selectionSort(int arr2[])
       {
              for(int i = 0; i < arr2.length-1; i++)
              {
                     int minPos = i;
                     for(int j = i+1; j < arr2.length; j++)
                     {
                            if(arr2[minPos] > arr2[j]) // insreasing order
                          //if(arr2[minPos] < arr2[j) // descending order
                            {
                                   minPos = j;
                            }
                     }
                     // Swap
                     int temp = arr2[minPos];
                     arr2[minPos] = arr2[i];
                     arr2[i] = temp;
              }
       }
       public static void printSelection(int[] arr2)
       {
              System.out.print("SelectionSort = ");
              for (int i = 0; i < arr2.length; i++)
              {
                     System.out.print(arr2[i]+" ");
              }
              System.out.println();
       }
    public static void main(String[] args) {
       int arr1[] = {5,4,1,3,2};
       int arr2[] = {8,7,9,4,1,5,6,2};
       bubbleSort(arr1);
       printBubble(arr1);
       selectionSort(arr2);
       printSelection(arr2);
    }
}

