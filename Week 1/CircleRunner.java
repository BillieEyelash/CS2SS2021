//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 23, 2021

import java.util.*;

public class CircleRunner
{

        public static double circleArea(double r)
        {
          /*
          * Calculate the area of a circle using the radius
          *
          * Parameters: double radius
          * Return: double area
          */
          double area = Math.pow(r, 2) * Math.PI;
          return Math.round(area * 100) / 100.0;
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
          System.out.println(circleArea(7.5) == 176.71);
          System.out.println(circleArea(10) == 314.16);
          System.out.println(circleArea(72.534) == 16528.49);
          System.out.println(circleArea(55) == 9503.32);
          System.out.println(circleArea(101) == 32047.39);
          System.out.println(circleArea(99.952) == 31385.77);
        }

        public static void run()
        {
          // Get the radius
          Scanner myScanner = new Scanner(System.in);
          double radius = get_double("Enter the radius: ", myScanner);

          // Calculate and print area
          System.out.println("Circle area: " + circleArea(radius));
        }

	public static void main( String[] args )
	{
      run();
      //test();
	}
}
