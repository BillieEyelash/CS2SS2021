import java.util.Scanner;

public class Primes
{
   public static void find_primes(int start, int end)
   {
      boolean isPrime;
      for (int i = start; i < end; i++)
      {
         isPrime = true;
         for (int j = 2; j <= i / 2; j++)
         {
            if (i % j == 0)
            {
               isPrime = false;
               break;
            }
         }
         if (isPrime) System.out.println(i + " is prime");
      }
   }
   
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a start value: ");
      int start = scan.nextInt();
      System.out.print("Enter an end value: ");
      int end = scan.nextInt();
      find_primes(start, end);
   }
}