// Name: Ria Talwar
// Date: June 24, 2021

import java.util.Scanner;

public class EvenOdd
{
      public static boolean is_even(int num)
      {
         /*
          * Determine whether or not a number is even
          *
          * Parameters: integer number
          * Return: boolean even or not
          */
         return num % 2 == 0;
      }
   
      public static void test()
      {
         System.out.println(is_even(0) == true);
         System.out.println(is_even(1) == false);
         System.out.println(is_even(2) == true);
         System.out.println(is_even(4) == true);
         System.out.println(is_even(-3) == false);
         System.out.println(is_even(-6) == true);
      }
   
      public static void run()
      {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = scan.nextInt();
         if (is_even(num)) System.out.println(num + " is even.");
         else System.out.println(num + " is odd.");
      }
   
   public static void main(String[] args)
   {
      run();
      //test();
   }
}