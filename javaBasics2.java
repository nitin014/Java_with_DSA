// Input in java
// Type conversion Type casting  Type promotion
import java.util.Scanner;  // package 

public class javaBasics2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       // String input = sc.next();  // captures till space
       // System.out.println(input);
        
        String name = sc.nextLine(); //full sentence
        System.out.println("My name is "+name);

        int number=sc.nextInt(); 
        System.out.println(number);

        /*
         next , nextLine  -- String
         nextInt , nextByte , nextFloat , nextDouble  --Numbers
         nextBoolean 
         */

         // sum from user input
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        int product = x*y;
        System.out.println("sum="+sum); 
        System.out.println("product="+product);

        // Area of circle
        double radius=sc.nextDouble();
        double area = 3.14*radius*radius;
         // for float values 3.14f
        System.out.println("area of circle="+area);

        /*  Type conversion || Widening conversion || Implicit conversion (happens automatically)
         In type conversion, a compiler converts a lower data type into a higher data type. 
          - no data loss
          - type compatibile
          -destination type > source type
            
          byte-> short-> int-> float-> long-> double 
         */
        int c1=25;
        long c2=c1;
        System.out.println("c2="+c2); // example
        float c3=sc.nextInt();
        System.out.println(c3); // example

        /*  Type Casting || Narrowing Conversion || Explicit Conversion
        In typecasting, a higher data type is converted into a lower data type.
        - chances of data loss
        eg: int marks=(int)(99.99f);
        */
        float c4 = 99.99f;
        int c5 =(int)c4;
        System.out.println(c5); // example

        // Note: Type conversion possible charcter to number.
        char ch1 = 'a';
        char ch2 = 'b';
        int n1 = ch1;
        int n2 = ch2;
        System.out.print("a="+n1+"\nb="+n2+"\n"); // example

        /*  Type Promotion:
          -- java automatically promotes each 
                 byte , short , char to int. while evaluating the expression.
          -- if one operand is long, float , double -> the expression will be promoted to long, float, double.     
        */

        System.out.println(ch2-ch1);

        /* byte a = 5;
           byte b = (byte)(a*2); //converted to expression so use type casting
         */
    } 
}   

 