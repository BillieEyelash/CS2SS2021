//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: July 2, 2021

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	public static void solveOne(ArrayList<String> expression, int index, String operator)
	{
		/*
		 * Description: Solves a single operator and modifies the equation with the answer
		 *
		 * Parameters: ArrayList String equation to simplify, integer index of operator, String operator type
		 * Return: void
		 */
		int operand1 = Integer.parseInt(expression.get(index - 1));	// Get the first operand
		int operand2 = Integer.parseInt(expression.get(index + 1));	// Get the second operand

		// Calculate the answer
		int answer;
		if (operator.equals("*")) answer = operand1 * operand2;
		else if (operator.equals("/")) answer = operand1 / operand2;
		else if (operator.equals("+")) answer = operand1 + operand2;
		else answer = operand1 - operand2;

		expression.remove(index - 1);																// Remove the first operand
		expression.remove(index - 1);																// Remove the operator
		expression.set(index - 1, Integer.toString(answer));				// Replace the second operand with the new answer
	}

	public static void solveOperators(ArrayList<String> expression, String operator1, String operator2)
	{
		/*
		 * Description: Solves certain operators in an equation
		 *
		 * Parameters: ArrayList String equation to solve, String operator to solve, String other operator to solve
		 * Return: void
		 */
		while (expression.contains(operator1) || expression.contains(operator2))
		{
			// Get indexes of both operators
			int index1 = expression.indexOf(operator1);
			int index2 = expression.indexOf(operator2);
			// Find first occurence and solve it
			if (index1 != -1 && (index2 == -1 || index1 < index2))
				solveOne(expression, index1, operator1);
			else
				solveOne(expression, index2, operator2);
		}
	}

	public static String solveExpression(String s)
	{
		/*
		 * Description: Solve an expression
		 *
		 * Parameters: String expression
		 * Return: String answer
		 */
		// Split string into array then copy into an ArrayList so it can be modified
		String[] array = s.split(" ");
		ArrayList<String> expression = new ArrayList<String>();
		for (int i = 0; i < array.length; i++)
			expression.add(array[i]);

		// Solve * and / first
		solveOperators(expression, "*", "/");
		// Then solve + and -
		solveOperators(expression, "+", "-");
		return expression.get(0);
	}
}
