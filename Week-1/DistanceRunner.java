//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 23, 2021

import java.util.Scanner;
import static java.lang.System.*;

public class DistanceRunner
{

        public static double get_distance(int x1, int y1, int x2, int y2)
        {
           /*
            * Calculate the distance between two points
            *
            * Parameters: integer coordinates of two points
            * Return: double the distance between the two points
            */
            double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            return Math.round(distance * 1000) / 1000.0;
        }

        public static int get_int(String output, Scanner myScanner)
        {
          /*
          * Get an integer from the user
          *
          * Parameters: string message to print, scanner used to scan for integer
          * Return: integer user input
          */
          System.out.print(output);
          return myScanner.nextInt();
         }

        public static void test()
        {
          System.out.println(get_distance(1, 1, 2, 1) == 1.000);
          System.out.println(get_distance(1, 1, -2, 2) == 3.162);
          System.out.println(get_distance(1, 1, 0, 0) == 1.414);
        }

        public static void run()
        {
          Scanner myScanner = new Scanner(System.in); // Create a new Scanner

          // Get coordinates
          int x1 = get_int("Enter X1: ", myScanner);
          int y1 = get_int("Enter Y1: ", myScanner);
          int x2 = get_int("Enter X2: ", myScanner);
          int y2 = get_int("Enter Y2: ", myScanner);

          // Calculate and print coordinates
          double distance = get_distance(x1, y1, x2, y2);
          System.out.println("Distance = " + distance);
        }

	public static void main(String[] args)
	{
      run();
      //test();
	}
}
