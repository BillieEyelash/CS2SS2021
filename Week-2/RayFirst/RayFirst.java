//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Ria Talwar
//Date: June 29, 2021

public class RayFirst
{
	public static boolean go(int[] ray)
	{
      if (ray.length == 0) return false;
      int first = ray[0];
      for (int i = 1; i < ray.length; i++)
      {
         if (first == ray[i]) return true;
      }
      return false;
	}
}