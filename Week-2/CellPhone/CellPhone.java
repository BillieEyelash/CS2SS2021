//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 28, 2021

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class CellPhone
{
   public static int calculate_talk_time(String start, String end)
   {
      /*
       * Description: determine how long someone talked based on a start and end time
       *
       * Parameters: String start talk time, String end talk time
       * Return: integer total talk time in min
       */
      int hr1 = Integer.parseInt(start.substring(0, start.indexOf(':')));
      int min1 = Integer.parseInt(start.substring(start.indexOf(':') + 1));
      int hr2 = Integer.parseInt(end.substring(0, end.indexOf(':')));
      int min2 = Integer.parseInt(end.substring(end.indexOf(':') + 1));
      int talkTime = (hr2 - hr1) * 60 + (min2 - min1);
      return talkTime;
   }
      
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("CellPhone.dat"));
		int size = file.nextInt(); // Number of lines in the file
		file.nextLine();
      
      String line;               // Track current line
      Scanner input;             // Use to get ints in current line
      int totalTime = 0;         // Total amount of time spent on the phone
      
		for(int i = 0; i < size; i++)
		{
         line = file.nextLine();
         input = new Scanner(line);
         totalTime += calculate_talk_time(input.next(), input.next());
		}
      System.out.println("Total talk time: " + totalTime);
	}
}