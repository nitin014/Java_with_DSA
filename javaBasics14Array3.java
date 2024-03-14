/* 
 *Trapping RainWater:  O(n)
                    (waterLevel - barHeight) * width
                    
     Situations: no water trapped
                    1. minimum no. of bars <=2
                    2. asc / desc -- bar arranged  
                    
    Algorithm:     waterLevel = min(maxLeft, maxRight)
                   TrappingRainWater = (waterLevel - barHeight)
                                              |
                                     min(maxLeft , maxRight)   
                                     
      Auxilary Arrays:(Helper array)                        
                                     -- calculate LeftMax and rightMax store in array
      */                                 

public class javaBasics14Array3 {

   public static int trappedRainWater(int height[])
   {
      int n = height.length;
      // calculate leftMax Boundary - array
      int leftMax[] = new int[n];
      leftMax[0] = height[0];
      for (int i = 1; i < n; i++)
      {
         leftMax[i] = Math.max(height[i], leftMax[i-1]);
      }
      // calculate rightMax Boundary - array
      int rightMax[] = new int[n];
      rightMax[n-1] = height[n-1];
      for (int i = n-2; i >= 0; i--)
      {
      rightMax[i] = Math.max(height[i], rightMax[i+1]);
      }
      int trappedWater = 0;
      // loop
      for (int i = 0; i < n; i++)
      {
         // waterLevel = min(leftmax bound, rightmax bound)
         int waterLevel = Math.min(leftMax[i], rightMax[i]);
         trappedWater += waterLevel - height[i];
      }
      return trappedWater;
   }

   /*
    * Buy and Sell Stocks : you are given array price where price[i] is the price of given stock on i'th day.
                           you want to maximize your profit by choosing a single day to buy one stock and choosing a different day to sell that stock.
                           Return maximum profit you can achieve from this transaction. if you cannot achieve profit return 0.
    */

   public static int buyAndSellStock(int price[]) // O(n)
   {
      int buyPrice = Integer.MAX_VALUE;
      int maxProfit = 0;
      for(int i = 0; i < price.length; i++)
      {
         if(buyPrice < price[i]) // profit
         {
            int profit = price[i] - buyPrice; // todays Profit
            maxProfit = Math.max(maxProfit, profit);
         }
         else 
         {
            buyPrice = price[i]; 
         }
      }
      return maxProfit;
   }

   public static void main(String[] args)
   {
      int height[] = {4,2,0,6,3,2,5};
      System.out.println("Water trapped : "+trappedRainWater(height));

      int price[] = {7,1,5,3,6,4};
      System.out.println("Max Profit for selling stock = "+buyAndSellStock(price));
   } 
}
 