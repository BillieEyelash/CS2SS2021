//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: July 2, 2021

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void test()
	{
		// Test cases
		ExpressionSolver es = new ExpressionSolver();
		System.out.println(es.solveExpression("3 + 5").equals("8"));
		System.out.println(es.solveExpression("3 * 5").equals("15"));
		System.out.println(es.solveExpression("3 - 5").equals("-2"));
		System.out.println(es.solveExpression("3 / 5").equals("0"));
		System.out.println(es.solveExpression("5 / 5 * 2 + 8 / 2 + 5").equals("11"));
		System.out.println(es.solveExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2").equals("41"));
	}

	public static void run()
	{
		// Create objects
		Scanner scan = new Scanner(System.in);
		ExpressionSolver es = new ExpressionSolver();
		// Get expression to solve and print
		System.out.print("Enter an expression: ");
		String expression = scan.nextLine();
		String answer = es.solveExpression(expression);
		System.out.println(expression + " = " + answer);
	}

	public static void main( String args[] )
	{
		run();
		//test();
	}
}
