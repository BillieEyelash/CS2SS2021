// Name: Ria Talwar
// Date: June 24, 2021

import java.util.Scanner;

public class HowMuchTax
{     
      public static int calculate_tax(int income)
      {
         /*
          * Calculate the amount a person owes in taxes based on their income
          *
          * Parameters: integer yearly income
          * Return: integer taxes owed
          */
         if (income > 40000) return (int)Math.round(income * 0.237);
         else if (income > 20000) return (int)Math.round(income * 0.108);
         else if (income > 10000) return (int)Math.round(income * 0.055);
         else if (income > 5000) return (int)Math.round(income * 0.03);
         return 0;
      }
   
      public static void test()
      {
         System.out.println(calculate_tax(1000) == 0);
         System.out.println(calculate_tax(7500) == 225);
         System.out.println(calculate_tax(15000) == 825);
         System.out.println(calculate_tax(35000) == 3780);
         System.out.println(calculate_tax(45000) == 10665);
      }
   
      public static void run()
      {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter your income: ");
         int income = scan.nextInt();
         System.out.println("Your tax is: $" + calculate_tax(income));
      }
   
   public static void main(String[] args)
   {
      run();
      //test();
   }
}