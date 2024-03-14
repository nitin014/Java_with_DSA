/* 
 * Insertion Sort -- pick an element from the (unsorted part) and place it in the right place(in sorted part).
                     eg: sort a hand of cards.

 * Counting Sort -- Non-comparision based sorting algorithm works well with limited range of numbers.
                    idea: count frequency of each element and then place it in the right position.
 */



public class javaBasics15Sorting1
{
    //* Insertion Sort
    public static void insertionSort(int[] arr1) // O(n^2)
    {
        for (int i = 1; i < arr1.length; i++)
        {
            int curr = arr1[i];
            int prev = i-1;
            //Finding out correct pos to insert
            //while(prev >=0 && arr1[prev] > curr) // ascending order
            while(prev >=0 && arr1[prev] < curr) // descending order
            {
                arr1[prev+1] = arr1[prev];
                prev--;
            }
            //Insertion
            arr1[prev+1] = curr;
        }
    }

    //* Counting Sort
    public static void countingSort(int[] arr2) //O(n+range)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr2.length; i++)
        {
            largest = Math.max(largest, arr2[i]);
        }
        //System.out.println(largest);
        int count[] = new int[largest+1];
        for(int i=0; i<arr2.length; i++)
        {
            count[arr2[i]]++;
        }
        //Sorting
        int j = 0;
        for(int i=0; i<count.length; i++)
        {
            while (count[i] > 0)
            {
                arr2[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) 
    {
        int arr1[] = {8,5,7,9,2,6};
        insertionSort(arr1);
        System.out.print("Insertion Sort = ");
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int arr2[] = {11,10,17,19,16,12,15,11};
        countingSort(arr2);
        System.out.print("Counting Sort = ");
        for(int i=0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

    }
}
