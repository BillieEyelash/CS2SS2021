// Name: Ria Talwar
// Date: June 24, 2021

import java.util.Scanner;

public class DiscountedPrice
{
      public static boolean can_get_discount(int price)
      {
         /*
          * Determine whether or not a discount is possible based on the price
          *
          * Parameters: integer price
          * Return: boolean can get discount or not
          */
         return price > 150;
      }
      
      public static int calculate_discount(int price)
      {
         /*
          * Calculate the 15% discount on a given price
          *
          * Parameters: integer price
          * Return: integer discounted price
          */
         return (int) Math.round(price * 0.85);
      }
   
      public static void test()
      {
         System.out.println(calculate_discount(180) == 153);
         System.out.println(calculate_discount(151) == 128);
         System.out.println();
         System.out.println(can_get_discount(150) == false);
         System.out.println(can_get_discount(167) == true);
         System.out.println(can_get_discount(124) == false);
      }
   
      public static void run()
      {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter the cost of your purchases: ");
         int price = scan.nextInt();
         if (can_get_discount(price)) System.out.println("Your discounted price is: $" + calculate_discount(price));
         else System.out.println("No discount. Your price is: $" + price);
      }
   
   public static void main(String[] args)
   {
      run();
      //test();
   }
}