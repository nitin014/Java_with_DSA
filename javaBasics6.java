/*Loops --repeat
    while loop    for loop    do while loop  ---  <<types>>

    while(condition){
        // do something
    }
*/
import java.util.Scanner;
public class javaBasics6 {
    public static void main(String[] args) {
     //while loop
     int count =0;
     while (count<5) {    // while (true) -- infinite loop b/c always true
        System.out.println("hello");
        count++;
     }
     try (//Q1.Print 1 to n
    Scanner sc = new Scanner(System.in)) {
        int n= sc.nextInt();
         int a=1;
         while (a<=n) {
            System.out.print(a +" ");
            a++;
         }
         //Q2.Sum of first x natural numbers
         int x= sc.nextInt();
         int sum =0;
         int i=0;
         while(i<=x)
         {
            sum +=i;
            i++;
         }
         System.out.println("sum: " + sum);
    }
    /*
        for loop -- (initialisation;condition;updation)
        */
    
        int i=1;
        for(i=0;i<10;i=i+2)
        {
            System.out.println("even no="+i);
        }
        //print square pattern
        for(int p1=1;p1<=4;p1++){
            System.out.println("****");
        }

        //Print reverse of a number

        int orignalno = 98765;
        while(orignalno > 0){
            int lastDigit = orignalno % 10;
            System.out.print(lastDigit+"");
            orignalno = orignalno / 10;
        }
        System.out.println();
     
        //Reverse the given number  --reverse orignal no
        //  rev= (rev*10)+lastDigit
        
        int reverse = 56238;
        int reversedno = 0; 
        while(reverse > 0) {
            int ld = reverse % 10;
            reversedno = (reversedno*10) + ld;
            reverse = reverse / 10;
        }
        System.out.println(reversedno);

        /*  do-while loop
             
            do{
                do something
            }while(condition);
         
         */
        int counter = 1;
        do{
            System.out.println("do-while");
            counter++;
            if(counter == 3){
                break;
            }
           // System.out.println("break loop");
        }while(counter <= 5);
        System.out.println("break loop");
        /*
         break Statement -- to exit the loop   
         */
        
    }
}


