
/* 
* primeno  , sum , factorial */

import java.util.*;

public class javaBasics8 {
    public static void main(String[] args) {

        // *check prime
        try (Scanner sc = new Scanner(System.in)) 
        {
            int no = sc.nextInt();
            if(no == 2){
                System.out.println("prime");
            }
            else{
                boolean isPrime = true;
                //for(int i=2 ;i <= no-1; i++ )
                for(int i=2; i <= Math.sqrt(no); i++) //optimize
                {
                    if(no % i ==0)
                    {
                        isPrime = false;
                    }
                }
                if(isPrime == true){
                    System.out.println("prime");
                }
                else{
                    System.out.println("not prime");
                }
            }
            //*  PRINT EVEN SUM AND ODD SUM 
            
            
            int y =sc.nextInt();
            int sumEven = 0;
            int sumOdd = 0;
            for(int i=1; i<=y; i++)
            {
                if(i%2 == 0)
                {
                    sumEven+=i;
                    
                    
                }
                else{
                    sumOdd += i;
                }
            }
            System.out.println(sumEven);
            System.out.println(sumOdd);

         //Write a program to find the factorial of any number entered by the user.
       
            int z =sc.nextInt();
            int fact = 1;
            for (int i = 1; i <=z; i++)
            {
                if(fact!=0)
                {
                    fact = fact*i;
                }
                //System.out.println(fact);
            }
            System.out.println("factorial="+fact);

            // Multiplication of a number 
             int mult =sc.nextInt();
             for(int i=1;i<=10;i++)
             {
                
                System.out.println(mult+"*"+i+"="+mult*i);
             }
             

             /*  What is wrong in the following program?

                public class Solution {
                public static void main(String args[]) {
                for(int i = 0; i <= 5; i++ ) {
                System.out.println("i = " + i );
                }
                System.out.println("i after the loop = " + i );
                    }
                }

              NOTE: Scope of variable is referred to the part of the program where the variable can be used.
                    In this program variable i is declared in the for loop. So scope of variable i is limited to the for
                    loop only that is between { and } of the for loop. There is a display statement after the for loop
                    where variable i is used which means i is used out of scope. This leads to compilation errors.
                    The program given will not run and give an error instead. To correct the program, the variable i
                    needs to be declared outside the for loop.

              */
    }
    }
        
        
    
    
}
