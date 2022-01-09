import java.util.*;
import java.io.*;

public class Fancyword
{
  public static char[][] create_hourglass(String word)
  {
    /*
     * Description: Create a matrix that is a word is shaped like an hourglass
     *
     * Parameters: String word to shape
     * Return: char[][] of the word shaped like an hourglass
     */
    char[][] hourglass = new char[word.length()][word.length()];

    for (int i = 0; i < word.length(); i++)
    {
      // First and last lines
      hourglass[0][i] = word.charAt(i);
      hourglass[word.length() - 1][i] = word.charAt(i);
      // Diagonals
      hourglass[i][i] = word.charAt(i);
      hourglass[word.length() - 1 - i][i] = word.charAt(i);
    }

    return hourglass;
  }

  public static void print_matrix(char[][] matrix)
  {
    /*
     * Description: Print a matrix with proper formatting
     *
     * Parameters: char[][] matrix to print
     * Return: void
     */
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[0].length; j++)
      {
        System.out.print(matrix[i][j]);
      }
      System.out.println(); // Need new line between each row
    }
  }

  public static void main(String [] args) throws IOException
  {
    Scanner scan = new Scanner(new File("Fancyword.txt"));  // Access file
    int numLines = Integer.parseInt(scan.nextLine());       // Get the number of lines, which should be at the top of the file
    String word;                                            // Track current word to print as hourglass

    for (int i = 0; i < numLines; i++)
    {
      // Get word, create and print hourglass
      word = scan.nextLine();
      char[][] hourglass = create_hourglass(word);
      print_matrix(hourglass);
      System.out.println();
    }
  }
}
