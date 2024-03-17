
/*
 *Maximum Sub-Array Sum -- 3 Aproach
 1. Brute force O(n^3)
 2. Prefix Sum O(n^3) - calculate the sum from index 0 till current index and store it at that index.
 3. Kadane's algorithm -- a dynamic programming technique
*/
public class javaBasics14Array2 
{
    
//* Maximum Sub-Array Sum : O(n^3) Brute-Force

public static void subarrayMax_Sum(int arr[])
{
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++)
    {
        int start = i;
        for(int j = i; j < arr.length; j++)
        {
            int end = j;
            currSum =0;
            for(int k = start; k <= end; k++)
            {
                // SubArray Sum
                currSum += arr[k];
            }
            System.out.println(currSum);
            if(maxSum < currSum)
            {
                maxSum = currSum;
            }
            //System.out.println();
        }
        //System.out.println();
    }
    System.out.println("max_Sum =" + maxSum);
}

// M.2 Prefix Array O(n^2)
public static void subArrayMax_Sum2(int arr[])
{
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    // Calculate PREFIX array
    for (int i = 1; i < prefix.length; i++)
    {
        prefix[i] = prefix[i-1] + arr[i];
    }
    for (int i =0; i < arr.length; i++)
    {
        int start = i;
        for(int j =i; j<arr.length; j++)
        {
            int end = j;
        
            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            if(maxSum < currSum)
            {
                maxSum = currSum;
            }
        }
    }
    System.out.println("maxSum2 = " + maxSum);

}

// M.3 Kadane's algorithm
public static void kadanes(int arr2[])
{
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i = 0; i < arr2.length; i++)
    {
        currSum += arr2[i];
        if(currSum < 0)
        {
            currSum = 0;
        }
        maxSum = Math.max(maxSum, currSum);
    }
    System.out.println("maxSum: " + maxSum);
}
    public static void main(String[] args) {
        int arr[] = {2,4,6,-8,10};
        subarrayMax_Sum(arr);
        subArrayMax_Sum2(arr);
        int arr2[] = {-2, -3, 4 , -1, -2, 1, 5, -3};
        kadanes(arr2);
    }
}
