//Variables & data types:

public class javaBasics1 {
    public static void main(String[] args) {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // Variables in java
       // 2*(a+b) -2(literal) & a and b are variables
       // literals v/s variables
       // identifiers-all names in java
       // memory - in java depends on what we are storing.

       int a=10;
       int b=5;
       System.out.println(a);
       System.out.println(b);

        String name = "Nitin Chaurasia";
        System.out.println(name);
        
        //possibilities:
        // 1.variable assign 
        // 2.variable values change 

        a=b;
        System.out.println(a);
        System.out.println(b);

        /*Data types:
        1. primitive(8)         2. Non-Primitive
                    size(byte) 
              byte     1               String
              short    2               Array
              char     2               Class
              boolean  1               Object
              int      4               Interface               
              float    4 
              long     8
              double   8 
             
        */
          
        byte p = 8;
        System.out.println(p);
        char ch = 'a';
        System.out.println(ch);
        boolean q = true;
        System.out.println(q);
         
        int x=15;
        int y=20;
        int sum = x+y;
        System.out.println(sum);

        /*comments :
            1. // - single line comment
            2. /*  hi              - multi line comment
                   how 
               */
        


    }
}
