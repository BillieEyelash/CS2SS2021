public class Employee
{
  private String name;
  private String employeeID;
  private int hours;
  private double payRate;

  public Employee(String n, String e, int h, double p)
  {
    name = n;
    employeeID = e;
    hours = h;
    payRate = p;
  }

  public String get_name()
  {
    return name;
  }

  public String get_id()
  {
    return employeeID;
  }

  public int get_hours()
  {
    return hours;
  }

  public double get_pay()
  {
    return payRate;
  }

  public void set_hours(int h)
  {
    hours = h;
  }

  public void set_pay(double p)
  {
    payRate = p;
  }

  public double weekly_pay()
  {
    if (hours > 40) return (40 * payRate + hours * payRate * 1.5);
    return hours * payRate;
  }

  public String to_string()
  {
    return "Name: " + name + " ID: " + employeeID + " Weekly Pay: " + weekly_pay();
  }
}
