public class javaBasics0  // class name same as java file name.
{   
    public static void main(String[] args) {
        System.out.print("Hello Nitin\n hi Nitin");
        System.out.print(" Hello Nitin");
        System.out.println(" Hello Nitin");
        System.out.println("Hello Nitin"); //print in console window 
    }
}

//java javaBasics.java-- how to run.!!

// boilerplate
// ; Statement terminator
//output in java : 1. print , 2.println , 3."\n"

/*  how java program is running  :

    source code  -->  Compiler  -->  Byte Code  -->  Java Virtual Machine  -->  Native Code 
      .java                           .class                                       |
        |                              | |                                         |  
        |______________________________| |_________________________________________|                             
               Compilation                           Execution         // two stages for program to run

    -- Compiler is program available in java devlopment kit.
  
    JDK --> In order to design, compile, and run the java application, we must first install JDK on our computer.
    JRE --> It is required for a computer to run a Java program.
    JVM --> The Java Virtual Machine’s job is to run the bytecode generated by the compiler. 
            Although each operating system has its own JVM, the output they provide after bytecode execution is consistent across all of them.
             Java is known as a platform-independent language for this reason.

 */ 