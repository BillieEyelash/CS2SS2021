//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 29, 2021

public class RaySumLast
{
	public static int go(int[] ray)
	{
      int last = ray[ray.length - 1];
      int sum = 0;
      for (int i = 0, n = ray.length - 1; i < n; i++)
      {
         if (ray[i] > last) sum += ray[i];
      }
      if (sum > 0) return sum;
		return -1;
	}
}