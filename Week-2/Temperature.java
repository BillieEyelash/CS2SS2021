import java.util.*;

public class Temperature
{
   public static int total_temp(int[] temps)
   {
     /*
      * Description: find the sum of all the temperatures in a list
      *
      * Parameters: integer[] list of temperatures in fahrenheit
      * Return: integer total temperature
      */
      int total = 0;
      for (int i = 0; i < temps.length; i++)
      {
         total += temps[i];
      }
      return total;
   }

   public static int avg_temp(int[] temps)
   {
     /*
      * Description: calculate the average temperature from a list
      *
      * Parameters: integer[] list of temperatures in fahrenheit
      * Return: integer average temperature
      */
      return total_temp(temps) / temps.length;
   }

   public static int num_even(int[] temps)
   {
     /*
      * Description: find the number of even temperatures
      *
      * Parameters: integer[] list of temperatures in fahrenheit
      * Return: integer number even temperatures
      */
      int even = 0;
      for (int i = 0; i < temps.length; i++)
      {
         if (temps[i] % 2 == 0) even++;
      }
      return even;
   }

   public static int highest_temp_index(int[] temps)
   {
     /*
      * Description: find the highest temperature in a list
      *
      * Parameters: integer[] list of temperatures in fahrenheit
      * Return: integer highest temperature
      */
      int maxIndex = 0;
      for (int i = 1; i < temps.length; i++)
      {
         if (temps[i] > temps[maxIndex]) maxIndex = i;
      }
      return maxIndex;
   }

   public static int above_seventy(int[] temps)
   {
     /*
      * Description: determine the number of temperatures above seventy
      *
      * Parameters: integer[] list of temperatures in fahrenheit
      * Return: integer number above seventy
      */
      int count = 0;
      for (int i = 0; i < temps.length; i++)
      {
         if (temps[i] >= 70) count++;
      }
      return count;
   }

   public static int highest_change(int[] temps)
   {
     /*
      * Description: determine the highest change in temperature in consecutive days
      *
      * Parameters: integer[] list of temperatures in fahrenheit
      * Return: integer highest change
      */
      int maxChange = 0;
      for (int i = 0; i < temps.length - 1; i++)
      {
         if (Math.abs(temps[i] - temps[i + 1]) > maxChange) maxChange = Math.abs(temps[i] - temps[i + 1]);
      }
      return maxChange;
   }

   public static int[] to_celsius(int[] fahrTemp)
   {
     /*
      * Description: create a list of temperatures converted to celsius
      *
      * Parameters: integer[] list of temperatures in fahrenheit
      * Return: integer[] list of temperatures in celsius
      */
      int[] celsiusTemp = new int[fahrTemp.length];
      for (int i = 0; i < fahrTemp.length; i++)
      {
         celsiusTemp[i] = (int)((fahrTemp[i] - 32) * (5.0/9.0));
      }
      return celsiusTemp;
   }

   public static int[] rotate_right(int[] temps)
   {
      /*
       * Description: create a version of a list shifted one place to the right
       *
       * Parameters: integer[] list of temperatures in fahrenheit
       * Return: integer[] rotated list
       */
      int[] rotated = new int[temps.length];
      for (int i = 0; i < temps.length; i++)
      {
         rotated[(i + 1) % temps.length] = temps[i];
      }
      return rotated;
   }

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      int[] temps = new int[7];

      for (int i = 0; i < 7; i++)   // Iterate over days and get temperatures
      {
        System.out.print("Enter the temperature on " + days[i] + ": ");
        temps[i] = scan.nextInt();
      }
      // Print results
      System.out.println("Total: " + total_temp(temps));
      System.out.println("Average: " + avg_temp(temps));
      System.out.println("Number of even: " + num_even(temps));
      int i = highest_temp_index(temps);
      System.out.println("Highest temperature: " + temps[i] + " on " + days[i]);
      System.out.println("Temperature above 70: " + above_seventy(temps));
      System.out.println("Highest change: " + highest_change(temps));
      System.out.println("Celsius: " + Arrays.toString(to_celsius(temps)));
      System.out.println("Rotated: " + Arrays.toString(rotate_right(temps)));
   }
}
