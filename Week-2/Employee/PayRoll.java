public class PayRoll
{
  public static int num_full_time(Employee[] list)
  {
    // Count the number of full time employees
    int count = 0;
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].get_pay() >= 40) count++;
    }
    return count;
  }

  public static String highest_pay(Employee[] list)
  {
    // Find the name of the person with the highest pay rate
    int highestIndex = 0;
    for (int i = 1; i < list.length; i++)
    {
      if (list[i].get_pay() > list[highestIndex].get_pay()) highestIndex = i;
    }
    return list[highestIndex].get_name();
  }

  public static double total_weekly_pay(Employee[] list)
  {
    // Calculate the combined weekly pay of all employees
    double total = 0;
    for (int i = 0; i < list.length; i++)
    {
      total += list[i].weekly_pay();
    }
    return total;
  }

  public static void starts_with(Employee[] list, char start)
  {
    // Find the people whose last names start with a certain char
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].get_name().charAt(list[i].get_name().indexOf(' ') + 1) == start)
        System.out.println(list[i].to_string());
    }
  }

  public static Employee match_ID(Employee[] list, String id)
  {
    // See if any employees have the same id as the one entered into the function
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].get_id().equals(id)) return list[i];
    }
    return null;
  }

  public static void remove_part_time(Employee[] list)
  {
    // Change all the part time employees to null
    for (int i = 0; i < list.length; i++)
    {
      if (list[i].get_hours() < 40) list[i] = null;
    }
  }

  public static void main(String[] args)
  {
    // Create employees
    Employee mb = new Employee("Melissa Black", "M7620", 30, 50);
    Employee rh = new Employee("Richard Hamerly", "R2304", 45, 35);
    Employee bb = new Employee("Bruce Beverly", "B9201", 25, 30);
    Employee jk = new Employee("Jessica Khan", "K7248", 42, 60);
    Employee ts = new Employee("Tom Sylvester", "S3810", 40, 45);
    Employee ab = new Employee("Ariana Bailey", "B4092", 40, 40);

    Employee[] list = {mb, rh, bb, jk, ts, ab}; // Create list of employees

    // Test methods
    System.out.println(num_full_time(list) == 4);
    System.out.println(highest_pay(list).equals("Jessica Khan"));
    System.out.println(total_weekly_pay(list));
    System.out.println();
    starts_with(list, 'B'); // Should print Melissa, Bruce, Ariana
    System.out.println();
    System.out.println(match_ID(list, "B4092") == ab);
    System.out.println(match_ID(list, "B4082") == null);
    remove_part_time(list);
    for (int i = 0; i < list.length; i++)
    {
      if (list[i] != null) System.out.println(list[i].to_string());
      else System.out.println("N/A");
    }
  }
}
