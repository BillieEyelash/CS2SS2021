//Name: Ria Talwar
//Date: July 2, 2021
//Class: Computer Science 2
//Lab: Factors

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouseRunner
{
	public static void main(String args[])
	{
		ArrayListFunHouse FunHouse = new ArrayListFunHouse();
		ArrayList <Integer> list = FunHouse.getListOfFactors(9);
		System.out.println(list); // [3]
		FunHouse.keepOnlyCompositeNumbers(list);
		System.out.println(list); // []

		list = FunHouse.getListOfFactors(1);
		System.out.println(list); // []
		FunHouse.keepOnlyCompositeNumbers(list);
		System.out.println(list); // []

		list = FunHouse.getListOfFactors(13);
		System.out.println(list); // []
		FunHouse.keepOnlyCompositeNumbers(list);
		System.out.println(list); // []

		list = FunHouse.getListOfFactors(24);
		System.out.println(list); // [2, 3, 4, 6, 8, 12]
		FunHouse.keepOnlyCompositeNumbers(list);
		System.out.println(list); // [4, 6, 8, 12]

		list = FunHouse.getListOfFactors(0);
		System.out.println(list); // []
		FunHouse.keepOnlyCompositeNumbers(list);
		System.out.println(list); // []
	}
}
