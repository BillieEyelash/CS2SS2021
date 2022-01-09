// Name: Ria Talwar
// Date: July 1, 2021
import java.util.*;
import java.io.*;

public class TicTacToe
{
  public static char[][] build_board(String line)
  {
    /*
     * Description: Create a tic tac toe board based on a line of characters
     *
     * Parameters: String line symbolizing board
     * Return: char[][] tic tac toe board
     */
    char[][] board = new char[3][3];
    int charIndex = 0;
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board[0].length; j++)
      {
        board[i][j] = line.charAt(charIndex);
        charIndex++;
      }
    }
    return board;
  }

  public static String determine_winner(char[][] game)
  {
    /*
     * Description: Determine the winner of a tic tac toe game
     *
     * Parameters: char[][] complete game of tic tac toe
     * Return: String message about winner
     */
    for (int i = 0; i < 3; i++)
    {
      if (game[i][0] == game[i][1] && game[i][0] == game[i][2]) // Win by row
        return (game[i][0] + " wins horizontally!");
      if (game[0][i] == game[1][i] && game[0][i] == game[2][i]) // Win by column
        return (game[0][i] + " wins vertically!");
    }
    
    if (game[0][0] == game[1][1] && game[0][0] == game[2][2])  // Win by diagonal (down right)
      return (game[0][0] + " wins diagonally!");
    if (game[0][2] == game[1][1] && game[0][2] == game[2][0])  // Win by diagonal (up right)
      return (game[0][2] + " wins diagonally!");

    return "Draw -- there is no winner."; // No other ways to win, meaning it is a draw
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
    Scanner file = new Scanner(new File("TicTacToe.txt"));
    int numLines = Integer.parseInt(file.nextLine());     // Number of games that have to be analyzed
    char[][] board;                                       // Track current board

    for (int i = 0; i < numLines; i++)
    {
      // Create and store board to be printed and analyzed
      board = build_board(file.nextLine());
      print_matrix(board);
      System.out.println(determine_winner(board));
    }
  }
}
