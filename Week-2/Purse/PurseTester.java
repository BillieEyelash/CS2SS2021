// Name: Ria Talwar
// Date: June 30, 2021

public class PurseTester
{
  public static int highest_total_coins(Purse[] list)
  {
    /*
     * Description: Find the highest total number of coins in a set of Purses
     *
     * Parameters: Purse[] array of Purse objects
     * Return: integer highest total number of coins
     */
    int highest = 0;
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].get_total() > highest) highest = list[i].get_total();
    }
    return highest;
  }

  public static double highest_total_value(Purse[] list)
  {
    /*
     * Description: Find the highest total value in a set of Purses
     *
     * Parameters: Purse[] array of Purse objects
     * Return: double highest total value
     */
    double highest = 0;
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].total_value() > highest) highest = list[i].total_value();
    }
    return highest;
  }

  public static Purse highest_num_quarters(Purse[] list)
  {
    /*
     * Description: Find the highest number of quarters in a set of Purses
     *
     * Parameters: Purse[] array of Purse objects
     * Return: Purse with highest number of quarters
     */
    int highestIndex = 0;
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].get_num_quarters() > list[highestIndex].get_num_quarters()) highestIndex = i;
    }
    return list[highestIndex];
  }

  public static int total_coins(Purse[] list)
  {
    /*
     * Description: Count the total number of coins in a set of purses
     *
     * Parameters: Purse[] array of Purse objects
     * Return: integer the total number of coins
     */
    int total = 0;
    for (int i = 0; i < list.length; i++)
    {
      total += list[i].get_total();
    }
    return total;
  }

  public static double total_value(Purse[] list)
  {
    /*
     * Description: Find the total value of a set of Purses
     *
     * Parameters: Purse[] array of Purse objects
     * Return: double total value of coins
     */
    double total = 0;
    for (int i = 0; i < list.length; i++)
    {
      total += list[i].total_value();
    }
    return total;
  }

  public static void main(String[] args)
  {
    // Create four purses using both the default constructor and the one that takes arguments
    Purse p1 = new Purse();
    Purse p2 = new Purse(1, 1, 1);
    Purse p3 = new Purse(3, 5, 7);
    Purse p4 = new Purse(9, 24, 8);

    // Add 5 quarters, 15 dimes and 8 nickels to Purse object p1
    p1.add_quarters(5);
    p1.add_dimes(15);
    p1.add_nickels(8);
    // Add 4 quarters, 20 dimes, and 10 nickels to Purse object p2
    p2.add_quarters(4);
    p2.add_dimes(20);
    p2.add_nickels(10);

    // Create a Purse array and add the Purse objects to the array
    Purse[] list = {p1, p2, p3, p4};
    // Print purses
    for (int i = 0; i < list.length; i++)
    {
      System.out.println(list[i].to_string());
    }

    // Test methods
    System.out.println(highest_total_coins(list));
    System.out.println(highest_total_value(list));
    System.out.println(highest_num_quarters(list).to_string());
    System.out.println(total_coins(list));
    System.out.println(total_value(list));
  }
}
