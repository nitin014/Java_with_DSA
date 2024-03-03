public class javaBasics14Array1 {

    //*Reverse an Array: T- O(n) S-O(1)
    public static void reverse(int arr1[])
    {
        int start = 0, end = arr1.length-1;
        while(start < end)
        {
            //swap
            int temp = arr1[end];
            arr1[end] = arr1[start];
            arr1[start] = temp;
            start++;
            end--;
        }
    }

    //*Pairs in the array: print , count  -- O(n^2) nested loops
    // totalPair = n*(n-1)/2  -- formula to count all pairs in array

    public static void pairs(int arr1[])
    {
        int totalPair = 0;
        System.out.println("pairs:"); // prints pairs of reversed array
        for(int i = 0; i <= arr1.length-1; i++)
        {   
            int x = arr1[i];
            //System.out.print("pairs:");
            for(int j = i+1; j <=arr1.length-1; j++)
            {
                System.out.print("(" + x + ","+arr1[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("totalPairs= "+totalPair);
    }

    //* Print Subarrays : a continous part of array   n*(n+1)/2
     // examples [2,4,6,8]  (246)- yes  (2,4,8) - no 
    public static void printSubarrays(int arr1[])
    {
        int totalSubarrays = 0;
        System.out.println("subarrays: ");
        for (int i = 0; i < arr1.length; i++)
        {
            int start = i;
            for (int j = start; j < arr1.length; j++)
            {
                int end = j;
                for (int k = start; k <= end; k++)
                {
                    System.out.print(arr1[k]+" ");
                    //totalSubarrays ++;
                }
                totalSubarrays ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total="+totalSubarrays);
    }



    public static void main(String[] args) {
        
        //Reverse an Array :
        int arr1[] = {44,81,66,79,22,12,19,63};
        reverse(arr1);
        System.out.print("Reversed Array: ");
        for(int i = 0; i < arr1.length; i++)
        {
            //System.out.print("REVERSE ");
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        // print pairs:
        pairs(arr1);

        // print subarray:
        printSubarrays(arr1);
    }
}
