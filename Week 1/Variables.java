/* Name: Ria Talwar
   Date: June 22, 2021
   Description: This declares variables of all the basic types and prints them
*/

public class Variables
{
   public static void main ( String[] args )
   {
   	//define 1 variable of each of the
   	//following data types
   	//byte	short		int 		long
   	//float	double
   	//char      boolean	String
   
   	//integer variables
   	byte byteOne = 127;
      short shortOne = Short.MAX_VALUE;
      int intOne = Integer.MAX_VALUE;
      long longOne = -6595695;
      
      //real variables
      float floatOne = 36.5678f;
      double doubleOne = 928.93;
      
      //other integer variables
      char charOne = 'A';
      
      //other variables
      String stringOne = "hello, world";
      boolean booleanOne = true;
   
   	System.out.println("/////////////////////////////////");
   	System.out.println("*Ria Talwar           06/21/2021*");
   	System.out.println("*                               *");
   	System.out.println("*        integer types          *");
   	System.out.println("*                               *");
   	System.out.println("*8 bit - byteOne = "+byteOne+"          *");
      System.out.println("*16 bit - shortOne = "+shortOne+"      *");
      System.out.println("*32 bit - intOne = "+intOne+"   *");
      System.out.println("*64 bit - longOne = "+longOne+"    *");
      System.out.println("*                               *");
   	System.out.println("*           real types          *");
   	System.out.println("*                               *");
      System.out.println("*32 bit - floatOne = "+floatOne+"    *");
      System.out.println("*64 bit - doubleOne = "+doubleOne+"    *");
      System.out.println("*                               *");
   	System.out.println("*      other integer types      *");
   	System.out.println("*                               *");
      System.out.println("*16 bit - charOne = "+charOne+"			  *");
      System.out.println("*                               *");
   	System.out.println("*          other types          *");
   	System.out.println("*                               *");
      System.out.println("*stringOne = "+stringOne+"       *");
      System.out.println("*booleanOne = "+booleanOne+"              *");
      System.out.println("/////////////////////////////////");
   }
}
