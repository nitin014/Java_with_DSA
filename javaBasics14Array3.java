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
    * Buy and Sell Stocks : 
    */

    
   public static void main(String[] args)
   {
      int height[] = {4,2,0,6,3,2,5};
      System.out.println("Water trapped : "+trappedRainWater(height));
   } 
}
 