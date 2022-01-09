//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 23, 2021

import java.util.*;

public class FahrenheitRunner
{

        public static double toCelsius(double f)
        {
          /*
          * Convert degrees fahrenheit to celsius
          *
          * Parameters: double degrees fahrenheit
          * Return: double degrees celsius
          */
          double c = (f - 32) * (5.0/9.0);
          return Math.round(c * 100) / 100.0;
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
          System.out.println(toCelsius(98.6) == 37.0);
          System.out.println(toCelsius(52.30) == 11.28);
          System.out.println(toCelsius(82.45) == 28.03);
          System.out.println(toCelsius(75.00) == 23.89);
          System.out.println(toCelsius(100.00) == 37.78);
        }

        public static void run()
        {
          // Get temperature
          Scanner myScanner = new Scanner(System.in);
          double f = get_double("Enter the temperature in fahrenheit: ", myScanner);

          // Calculate and print temperature in celsius
          System.out.println(toCelsius(f) + " degreees Celsius");
        }

	public static void main( String[] args )
	{
      run();
      //test();
	}
}
