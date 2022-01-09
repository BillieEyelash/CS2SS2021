//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 23, 2021

import java.util.*;

public class RectRunner
{

        public static double perimeter(double len, double w)
        {
          /*
          * Calculate the perimeter of a rectangle given the length and width
          *
          * Parameters: double length, width
          * Return: double perimeter
          */
          double perimeter = 2 * (len + w);
          return Math.round(perimeter * 100) / 100.0;
        }

        public static double get_double(String output, Scanner myScanner)
        {
          /*
          * Get a double from the user
          *
          * Parameters: string message to print, scanner used to scan for integer
          * Return: double user input
          */
          System.out.print(output);
          return myScanner.nextDouble();
         }

        public static void test()
        {
          System.out.println(perimeter(12, 5) == 34.0);
          System.out.println(perimeter(131, 75) == 412.0);
          System.out.println(perimeter(20, 25) == 90.0);
          System.out.println(perimeter(9, 256) == 530.0);
          System.out.println(perimeter(36, 72) == 216.0);
          System.out.println(perimeter(8, 6) == 28.0);
          System.out.println(perimeter(18, 16) == 68.0);
        }

        public static void run()
        {
          // Get length and width
          Scanner myScanner = new Scanner(System.in);
          double length = get_double("Enter the length: ", myScanner);
          double width = get_double("Enter the width: ", myScanner);

          // Calculate and print perimeter
          System.out.println("Perimeter: " + perimeter(length, width));
        }

	public static void main( String[] args )
	{
      run();
      //test();
	}
}
