// Name: Ria Talwar
// Date: June 24, 2021

import java.util.Scanner;

public class SocialSecurity
{     
      public static boolean is_valid(String ssNum)
      {
         /*
          * Determines whether or not a social security number is valid
          *
          * Parameters: string social security number
          * Return: boolean whether or not number is valid
          */
         return ssNum.indexOf('-') != ssNum.lastIndexOf('-');
      }
      
      public static int calculate_total(String ssNum)
      {
         /*
          * Determines whether or not a social security number is valid
          *
          * Parameters: string social security number
          * Return: boolean whether or not number is valid
          */
         if (is_valid(ssNum))
         {
            int dIndex1 = ssNum.indexOf('-');
            int dIndex2 = ssNum.lastIndexOf('-');
            int p1 = Integer.parseInt(ssNum.substring(0, dIndex1));
            int p2 = Integer.parseInt(ssNum.substring(dIndex1 + 1, dIndex2));
            int p3 = Integer.parseInt(ssNum.substring(dIndex2 + 1));
            return p1 + p2 + p3;
         }
         return -1;
      }
   
      public static void test()
      {
         System.out.println(calculate_total("1-1-1") == 3);
         System.out.println(calculate_total("456-56-234") == 746);
         System.out.println(calculate_total("102-2-12") == 116);
         System.out.println(calculate_total("0-0-0") == 0);
         System.out.println(calculate_total("75-99") == -1);
      }
   
      public static void run()
      {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter your Social Security number: ");
         String ssNum = scan.nextLine();
         System.out.println("SS# " + ssNum + " has a total of " + calculate_total(ssNum));
      }
   
   public static void main(String[] args)
   {
      run();
      //test();
   }
}