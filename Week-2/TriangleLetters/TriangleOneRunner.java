//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 28, 2021

import java.io.*;
import java.util.Scanner;

public class TriangleOneRunner
{
   public static void print_triangle(int size, String letter)
   {
      /*
       * Description: repeatedly print out a char to form a triangle
       *
       * Parameters: integer triangle size, character letter to print
       * Return: void
       */
      for (int i = 1; i <= size; i++)
      {
         for (int j = 1; j <= i; j++)
         {
            System.out.print(letter);
         }
         System.out.println();
      }
   }
   
   public static void main(String args[]) throws IOException
   {
      Scanner scan = new Scanner(new File("triangleOne.txt"));
      String line;         // Track current line
      Scanner input;       // Use to get size/letter from current line
      
      while (scan.hasNextLine())
      {
         line = scan.nextLine();
         input = new Scanner(line);         
         int size = Integer.parseInt(input.next());   // Get integer size
         String letter = input.next();                // Get the letter to repeat
         print_triangle(size, letter);
         System.out.println();
      }
   }
}