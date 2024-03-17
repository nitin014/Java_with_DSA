/*
 *  String : String(non-primitive) is an object that represents an array 
 *              or sequence of characters.
 *  3 classes in java to create string -- 
                                          1. String class
                                          2. String Builder class
                                          3. String Buffer class

     *String class -- fundamental class in java to work with string, It is a part of "java.lang" package (automatically imported into java program).
                      i.e, we don't need to import string class to use in our code.
                    *--String class is used to create string which are immutable(means once string object created value can't be changed).
                    uses: java APIS and libraries as well as communication between different systems
                          provide compatibility and interpolarability across various platforms



 */


import java.util.*; 
public class javaBasics17Strings {

    //*Print characters
    public static void printCharacter(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    //*Check if a string is Palindrome:
    public static boolean checkPalindrome(String str)
    {
        for(int i=0; i<str.length()/2; i++)
        {
            int n = str.length();
            if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        //*declaring String
        String str1 = "abcd";
        String str2 = new String("abc@1234");

        Scanner sc = new Scanner(System.in);
        String name1,name2;

        //*User input
        //name1 = sc.next();          // takes word
        //System.out.println("MY name is = "+name1);
       
        name2 = sc.nextLine();     //takes full line as input
        System.out.println("My name is = "+name2);
        
        //*find length of String
        //String city = "Dhanbad";
        System.out.println("string length is = "+name2.length()); // count length of String (including space)

        //* Concatenation -- add 
        String firstName = "Tony";
        String lastName = "Stanley";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        //* print characters
        System.out.println(fullName.charAt(0));

        printCharacter(fullName);

        //print palindrome
        String str = "NitIn";
        System.out.println("palindrome check = "+checkPalindrome(str));

        //Comparision (String Interning)
        String s1 = "Stark";
        String s2 = "Stark";  // check for variable storing same value in string pool
        String s3 = new String("Stark");
        if(s1==s2)
        {
            System.out.println("String s1 & s2 equal");
        }
        else{
            System.out.println("String s1 & s2 not equal");
        }
        if(s1==s3)
        {
            System.out.println("String s1 & s3 equal");
        }
        else{
            System.out.println("String s1 & s3 not equal");
        }

        if(s1.equals(s3)) // returns boolean value
        {
            System.out.println("string s1 & s3 equal");
        }
        else{
            System.err.println("string s1 & s3 not equal");
        }

        //Integer class wraps a value of the primitive type int in an object.
        Integer a=10;
        System.out.println(a.toString());
        Character ch = 'n';
        System.out.println(ch.toString());

        StringBuilder sb = new StringBuilder("");  //O(26) loop run 26 times but if we use string it becomes O(n^2) because every time it copy the 
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++)
        {
            sb.append(ch1+" ");  // append() string k peeche add krta h 
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
/*
 * -------------------------------------------------------------------------------------------------
|                                      String Interning                                        |
-------------------------------------------------------------------------------------------------
 *String Interning Mechanism: Allows multiple string variables to reference the same memory location for identical string literals.
 *Memory Efficiency: String interning optimizes memory usage by avoiding the creation of duplicate string objects in memory.
 *Automatic Interning: Strings created using literals (e.g., `"hello"`) are automatically interned by the Java Virtual Machine (JVM).
 *Explicit Creation**: Strings created explicitly using the `new` keyword (e.g., `String s = new String("hello");`) bypass string interning by default.
 *Benefits**: Conserves memory resources by ensuring that identical string literals share the same memory location, reducing memory overhead.

**Diagram**:

String Pool:
| "hello" |
| |
| "world" |
|___________|

*In this diagram, the String Pool contains two string literals, "hello" and "world".

-------------------------------------------------------------------------------------------------
|                                    Memory Management                                         |
-------------------------------------------------------------------------------------------------
 *Stack Memory Usage: Stack memory is utilized to store references and addresses of variables.
 *String Pool: String literals are stored in a dedicated area called the string pool, which is part of the heap memory.
 *JVM Allocation: When encountering a new string, the JVM first checks if it exists in the string pool.
  - If the string is found in the pool, a reference to its existing memory location is provided.
  - If the string is not found, the JVM allocates memory for the new string in the heap.

**Diagram**:

*Stack Memory:

| S1 @ "hello" |
| S2 @ "hello" |
|___________________|

*In this diagram, the Stack Memory contains two string variables, S1 and S2, both pointing to the same memory location containing the string "hello" from the String Pool.

-------------------------------------------------------------------------------------------------
|                            == operator VS equals() Method                                         |
-------------------------------------------------------------------------------------------------
- **Comparison**: `==` operator compares memory locations, while `.equals()` method compares character by character.
- **Example**: `S1 == S2` compares memory locations (returns `false`), but `S1.equals(S2)` compares characters and returns `true`.

-------------------------------------------------------------------------------------------------
|                                     Immutability                                             |
-------------------------------------------------------------------------------------------------
 *String Immutability*: Strings in Java are immutable; their content cannot be changed after creation.
 **Instance vs. Reference Immutability**: The reference to a string is immutable, but the instance (content) is not. Once a string object is created, its content cannot be modified.
 *Impact*: Immutability leads to low performance issues due to the creation of new string objects for each modification.

-------------------------------------------------------------------------------------------------
|                                 StringBuilder Class                                          |
-------------------------------------------------------------------------------------------------
 *Making Strings Mutable*: To make strings mutable in Java, the `StringBuilder` class is used.
 *Usage*: `StringBuilder` allows for efficient manipulation of strings, avoiding the creation of new string objects for each modification.
 *Benefit*: Reduces memory overhead and improves performance, especially in scenarios involving frequent string modifications.
 StringBuilder sb = new StringBuilder("Niting");
  sb.toString(); // converts any object to string
    eg: int a=10;         |   eg: Integer a=10;
        a.toString();     |       a.toString();    
        (not possible)    |         (possible)
 */