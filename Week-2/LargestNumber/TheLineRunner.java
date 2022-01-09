//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 28, 2021

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class TheLineRunner
{
   public static int find_largest(Scanner line)
   {
      /*
       * Description: find the largest integer in a line
       *
       * Parameters: Scanner line of integers
       * Return: integer largest in line
       */
      int largest = Integer.MIN_VALUE; // Track largest value so far
      int current;                     // Track current value
      while (line.hasNextInt())
      {
         // Get current value and update largest when necessary
         current = line.nextInt();
         if (current > largest) largest = current;
      }
      return largest;
   }
      
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("line.dat"));
		int size = file.nextInt(); // Number of lines in the file
		file.nextLine();
      
      String line;               // Track current line
      Scanner input;             // Use to get ints in current line
      
		for(int i = 0; i < size; i++)
		{
         line = file.nextLine();
         input = new Scanner(line);
         int largest = find_largest(input);
         System.out.println("Largest: " + largest);
		}
	}
}