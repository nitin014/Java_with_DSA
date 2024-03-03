/*
    * METHODS / FUNCTIONS

      Block of code (logic inside) to perform the particular task.
      -- reusable eg:tv remote button
      SYNTAX: 
       returnType name() 
      {
        body
        return statement;
      }
        public static void main(String args[]) --
        * void-- return type (empty)
        * main-- reserve keyword
        *inside main input is String args[]
                                      |
                                      -- is array[]
        * public static -- acces modifier

      METHODS- if we define the functions inside the class then it is called Methods.
      --We can make multiple functions inside the class.
     
    *Two types of parameters
        - Formal Parameters or Parameters     --Actual Parameters or Arguments
                |--> function defination passed               |-->function calling passed

    *What happens inside memory (temporary memory allocated)
        fn occupies memory (call stack) stores all info and task (main,fn1,fn2,variables...)
      

    *Types of methods:
    1. user defined methods   eg:(factorial, sum , product)
    2. Inbuilt Methods  --   present already  eg: Math(.pow, .sqrty, .max), sc.nextInt()
*/




import java.util.*;
public class javaBasics10 {
  //assecsModifier returnType functionName
    public static int printHelloWorld()
//  public static void printHelloWorld() -- may ignore return type
    {
      System.out.println("Hello World");
      return 1;   // return int value 
//    return;
    }

    //function to calc sum:
    public static int calcSum(int x, int y) // parametres or formal parameters - passed during function defination
    //public static void calcSum(int x, int y) 
    {
        int sum = x + y;
        return sum;
        //System.out.println("sum = " + sum); 
    }

    //function to swap 2 nos:
    public static void swap(int x, int y){
      int temp = x;
      x=y;
      y=temp;
      System.out.println("swapped");
      System.out.println(x);
      System.out.println(y);
    }  

    // function to calculate product: Method 1
     public static void product(int x, int y)
     {
      int product = x*y;
      System.out.println("Multiply="+product);
     }
     // function to calculate product: Method 2
    public static int product(int x, int y,int z){
      int product = x*y*z;
      return product;
    }

    // function to calculate factorial of number:
    public static int factorial(int n){
       int f=1;
       for(int i=2; i<=n; i++){
        f = f*i;
       }
       return f;
    }

    // find Bionomial Coefficient
       public static int binCoeff(int n, int r)
       {
          int n_fact = factorial(n);
          int r_fact = factorial(r);
          int fact = factorial(n-r);
          int bincoeff = n_fact/(r_fact*fact);
          return bincoeff;
       }

  public static void main(String args[]) {
        printHelloWorld(); // fn call
        printHelloWorld();
        printHelloWorld();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //calcSum(a,b);
        int sum = calcSum(a,b); //arguments or actual parameters - values passed while calling a function.
        System.out.println("SUM="+sum);
        swap(10,11);  // call by value -- copy of variable is pased
        
        /* Java always call by value (all changes inside the fn only not outside) b/c that fn removed from call stack if its work is over.
          in call by Reference orignal value -- copy of variable is pased .(not used in java rather c++)
        */

        product(5,6);
        int mul=product(7,8,9);
        //int mult=product(5,6);
        System.out.println("product="+mul);

        //int fact=factorial(5);
        System.out.println("Factorial="+factorial(5));

        System.out.println("binomial_coefficient="+binCoeff(5,2));
    }
}
 
