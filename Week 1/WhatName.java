// Name: Ria Talwar
// Date: June 24, 2021

import java.util.Scanner;

public class WhatName
{
      public static boolean is_even(String name)
      {
         /*
          * Determine whether or not the length of a name is even
          *
          * Parameters: string name
          * Return: boolean even or not
          */
         return name.length() % 2 == 0;
      }
   
      public static void test()
      {
         System.out.println(is_even("") == true);
         System.out.println(is_even("Emma") == true);
         System.out.println(is_even("Ria") == false);
         System.out.println(is_even("a") == false);
         System.out.println(is_even("Om") == true);
      }
   
      public static void run()
      {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter a name: ");
         String name = scan.nextLine();
         if (is_even(name)) System.out.println(name + " has an even number of characters.");
         else System.out.println(name + " is has an odd number of characters.");
      }
   
   public static void main(String[] args)
   {
      run();
      //test();
   }
}