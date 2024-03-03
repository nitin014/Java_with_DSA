 //operators
// practice questions
import java.util.Scanner;
public class javaBasics3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
       /*1. In a program, input 3 numbers : A, B and C. You have to output the average of
        these 3 numbers. */

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        double avg = (n1+n2+n3)/3;
        System.out.println("avg="+avg);

        /*2. In a program, input the side of a square. You have to output the area of the
           square */
           int side = sc.nextInt();
           int area =side*side;
           System.out.println("area="+area);

           /*3.Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
            an eraser. You have to output the total cost of the items back to the user as their bill.
           (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) 

           */
            float pencil = sc.nextFloat();
            float pen =sc.nextFloat();
            float eraser = sc.nextFloat();
            float bill = pencil + pen + eraser;
            System.out.println("bill = " + bill);
            float newBill = bill + (bill*0.18f);
            System.out.println("newBill="+newBill);

            /*  Identifier rule says, identifiers can start with
                    any alphabet or underscore (“_”) or dollar (“$”).*/

            /* Operators in java -
              1.Arithmetic operatiors (Binary / Unrary)
              2.Relational operators
              3.Logical operators
              4.Bitwise operators (Bit Manipulation)
              5.Assignment operators
                                                                            value change,value use     value use,value change
              Arithmetic operatiors                                                   |                 |
                 Binary  -- 2 operands                       Unary --1 operand     pre               post
                    +                                            a = a+1  <-->     ++a               a++     //increment
                    -                                            b = b-1  <-->     --b               b--     //decrement
                    *
                    /
                    % (Modulo-- fetches remainder)

              Relational operators ==, !=(not equal), >, <, >=, <=      

              Logical operators                   Assingment operator
              && (AND)    T-- T T                   =
                          F-- T F                   +=   a=a+1 <--> a+=1
                          F-- F T                   -=
                          F-- F F                   *=
                                                    /=
              || (OR)     T-- T T
                          T-- T F
                          T-- F T
                          F-- F F

              !=  (NOT)    F--T
                          T--F

                 -- Operator precedence determines the order in which the operators in an expression are
                      evaluated.
                          
            */        

    


    }
}
