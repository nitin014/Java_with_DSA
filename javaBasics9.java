
//  *pattern

import java.util.*;

public class javaBasics9 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i<=n;i++) 
        {
            for(int j =1; j<=i; j++)
            {
                //System.out.print("*");  //star pattern increase
                /*System.out.print("i");
                  1
                  22
                  333
                  4444
                */

                System.out.print(j);/*1
                                      12
                                      123
                                      1234 */
            }
            System.out.println(" ");
        }
        //System.out.println("*");

        for(int i = 1; i<=n; i++)
        {
            for(int j =1; j<=n-i+1; j++){
                //System.out.print("*"); star pattern decrease
                //System.out.print("i");
                System.out.print(j);
            }
            System.out.println(" ");
        }
        char ch = 'A';
        //int k =1;
        for(int i =1; i<=n;i++){
            for(int j = 1; j <= i; j++)
            {
                //System.out.print(k++); // floyds triangle pattern
                System.out.print(ch++);
                //ch--;
                
            }
            System.out.println(" ");
        }   

    }
}
