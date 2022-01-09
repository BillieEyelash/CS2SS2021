import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class SimpleCalculator
{
   public static boolean is_end(String line)
   {
      /*
       * Description: determine whether or not this line is the end of the file
       *
       * Parameters: String line from file
       * Return: boolean is end or not
       */
      String[] splitLine = line.split(" ");
      return (splitLine[0].equals("0") && splitLine[1].equals("="));
   }
   
   public static int solve_equation(String line)
   {
      /*
       * Description: solve a basic math equation
       *
       * Parameters: String line with equation
       * Return: int answer to equation
       */
      String[] equation = line.split(" ");
      int answer = Integer.parseInt(equation[0]);  // Start with first number
      String symbol;
      int n;
      
      for (int i = 1; i < equation.length; i += 2)
      {
         symbol = equation[i];
         if (symbol.equals("=")) return answer;    // End of equation so return answer
         // If not end get next int and perform operation
         n = Integer.parseInt(equation[i + 1]);
         if (symbol.equals("+")) answer += n;
         else if (symbol.equals("-")) answer -= n;
         else if (symbol.equals("*")) answer *= n;
         else if (symbol.equals("/")) answer /= n;
      }
      return 1;
   }
   
   public static void main(String[] args) throws IOException
   {
      Scanner file = new Scanner(new File("SimpleCalculator.txt"));
      String line = file.nextLine();
      
      while (!is_end(line))
      {
         int answer = solve_equation(line);
         System.out.println(answer);
         line = file.nextLine();
      }
   }
}