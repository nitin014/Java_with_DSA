/*
  *Function overloading: Multiple functions with the same name but different parameters. 
    - type different or no of parameters different (diffrenciating facrors).
        eg: calculator:
               add(add 2 nos)    multiply(2nos)       // int , float, double.....
               add(add 3 nos)    multiply(3nos) 
               add(add 4 nos)    multiply(4nos)

               nothing to do with return type( give errors).
                 int sum(int a, int b)
                 float sum(int a, int b)
 */



public class javaBasics11 {
    
    //*Overloading using different paarameters  
    // fn to add 2 nos.
    public static int sum(int a, int b){
        return a + b;
    }

    // fn to add 3 nos.
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // * Overloading using Data Type
     
    public static float sum(float a, float b){
        return a + b;
    }

    //* fn to check Prime (n>=2)
    public static boolean isPrime(int n)
    {
        // corner case
        if(n == 2) {
            return true;
        }

        //boolean isPrime = true;
        //for(int i = 2; i <= n-1; i++)
        for(int i = 2; i <= Math.sqrt(n); i++) //*Optimized
        {
            if(n % i == 0)
            {
                //isPrime = false;
                //break;
                return false;
            }
        }
        //return isPrime;
        return true;
    }

    //*fn to print prime nos in range: (2-n)
    public static void primeRange(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("are Prime no.");
    }

    /*
     * Block Scope :  Variable declared inside the block can be accessed inside the block not outside.
                    {
                        Blocks of code
                    }
        *(  Class scope : ---> access modifiers)   
        
     * Scope : once Variable declared then where we can use that variable is decided by its scope.
          
     *Method scope : var declared inside the fn , then it can be used anywhere inside that function.
                    compiler will check line by line.
     
     */
    
    

    public static void main(String[] args) {
        int add2 = sum(2,3);
        int add3=sum(4,5,6);
        float fadd2 = sum(2.3f,3.2f);
        System.out.println("add 2 no ="+add2+"\nadd 3 no ="+add3+"\nadd 2 float no ="+fadd2);
        System.out.println("12 isPrime?= "+isPrime(12));
        System.err.println("17 isPrime?= "+isPrime(17));
        primeRange(100);
    }
}
