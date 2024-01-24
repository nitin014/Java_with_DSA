//Conditional Statements
/*
 1.if,else
 2.else if
 3.ternary operator
 4.switch
 */

import java.util.Scanner;

public class javaBasics4 {
    public static void main(String[] args) {
        /*
        {baar baar check hoga agar if true bhi h to.}
          if(condition){        
               statement 1                 if--> true 
          }                                 statement 1 executed !
          if(condition){
                statement 1.1
          }
          else {
                statement 2                if--> false
          }                                 else block statement 2 executed !
        */
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("I can vote ");
        }
        else{
            System.out.println("I cannot vote ");
        }
        // print largest of two numbers:
        int x=5;
        int y=8;
        if(x>=y){
            System.out.println("x is larger than y");
        }
        else{
            System.out.println("y is larger than x");
        }
        // print no is even or is odd:
        int no =sc.nextInt();
        if(no%2==0){
            System.out.println(no+" is even");
        }
        else{
            System.out.println(no+" is odd");
        }

        /*
         else if statement  {agar true milla to condition stop no further checking}
            if(condition 1){

            }
            else if(condition 2)
            {

            }
            else if(condition 3)
            {

            }
            else{

            }
         */
        /*income tax calculation code
         income < 5lpa -- 0% tax
         income 5-10lpa --20% tax
         income > 10lpa --30% tax
        */
        int income = sc.nextInt();
        int tax ;
        if(income < 500000){
            tax=0;
        }
        else if(income >= 500000 && income < 100000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("your tax is:"+tax);
        
        // print largest of 3 nos
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("greatest of three");
        if((p >= q) && (q >= r)){
            System.out.println("p");
        }
        else if(q>=r){
            System.out.println("q");
        }
        else
        System.out.println("r");

        /*ternary operator -- {3 operands }  // alternate if-else
         variable = condition ? statement1 : statement2;
                condition --true statement1 executed
                condition --false statement2 executed
                eg: boolean larger = (5 > 3) ? 5 : 3;
                eg: String type = (5 % 2 == 0) ? "even" : "odd";
        */

        /* switch statement  -- if-else-if ladder statement {executes one statement from multiple conditions}
                              -- works with the byte, short, char, int 
                              EG- juice machine 
        */
        //eg1
        int check=2;  //char ch='a'
        switch (check) { //switch(ch)
            case 1 : System.out.println("coke"); //case 'a'
                break;
            case 2 : System.out.println("pepsi");    
                break;
            case 3 : System.out.println("mazza");
            break;  

            default : System.out.println("sorry! AllOver");
        }

        //eg2 calculator
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.println(c1+c2);
                break;
            case '-': System.out.println(c1-c2);
                break;
            case '*': System.out.println(c1*c2);
                break;
            case '/': System.out.println(c1/c2);
                break;
            case '%': System.out.println(c1%c2);
                break;            
            default:System.out.println("wrong operator");
                
        }
    }
}
