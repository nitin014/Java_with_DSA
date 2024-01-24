import java.util.Scanner;

public class javaBasics7 {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            // break example -- keep entering no till user enters multiple of 10
            do{
                System.out.println("name??");
                int name = sc.nextInt();
                if(name % 10 == 0) {
                    break;
            }
            System.out.println(name);
            }while(true);

            //continue keyword -- to skip iteration
             
            for(int i = 0; i<=5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i);
            }
             
      // Display all nos enter by user except multiples of 10
      do{ 
      int no = sc.nextInt();
      System.out.println("Enter no");
      if(no % 10 == 0){
            
      }
      System.out.println(no);
      }while(true);
    }   

    try (Scanner s = new Scanner(System.in)) 
        {
            int no = sc.nextInt();
            if(no == 2){
                System.out.println("prime");
            }
            else{
                boolean isPrime = true;
                for(int i=2 ;i <= no-1; i++ )
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

        }
    }
}
