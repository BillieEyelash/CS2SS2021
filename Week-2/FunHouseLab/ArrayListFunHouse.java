//Name: Ria Talwar
//Date: July 2, 2021
//Class: Computer Science 2
//Lab: Factors

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= number / 2; i++)
		{
			if (number % i == 0) factors.add(i);
		}
		return factors;
	}

	public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums)
	{
		for (int i = nums.size() - 1; i >= 0; i--)
		{
			if (getListOfFactors(nums.get(i)).size() == 0) nums.remove(i);
		}
	}
}
