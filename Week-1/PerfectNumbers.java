import java.util.Scanner;

public class PerfectNumbers
{
      public static boolean is_perfect(int n)
      {
         /*
          * Determine whether or not a number is perfect
          *
          * Parameters: int number to test
          * Return: boolean whether or not is perfect
          */
         if (n <= 0) return false; // Only positive integers can be perfect
         
         int divisorSum = 0;       // Track sum of divisors
         for (int i = 1; i <= (n / 2); i++)
         {
            if (n % i == 0) divisorSum += i;
         }
         return divisorSum == n;   // Is perfect if sum of divisors equals n
      }

      public static void test()
      {
         System.out.println(is_perfect(0) == false);
         System.out.println(is_perfect(-6) == false);
         System.out.println(is_perfect(6) == true);
         System.out.println(is_perfect(45) == false);
         System.out.println(is_perfect(8128) == true);
         System.out.println(is_perfect(1245) == false);
         System.out.println(is_perfect(33) == false);
         System.out.println(is_perfect(28) == true);
         System.out.println(is_perfect(27) == false);
         System.out.println(is_perfect(14) == false);
         System.out.println(is_perfect(33550336) == true);
         System.out.println(is_perfect(496) == true);
      }
      
      public static void run()
      {
         // Get an integer from the user
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int n = scan.nextInt();
         
         // Print out whether or not the number is perfect
         if (is_perfect(n)) System.out.println(n + " is perfect.");
         else System.out.println(n + " is not perfect.");
      }
      
   public static void main(String[] args)
   {
      run();
      //test();
   }
}