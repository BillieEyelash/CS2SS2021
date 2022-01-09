// Name: Ria Talwar
// Date: June 30, 2021

public class Purse
{
  private int numQuarters;
  private int numDimes;
  private int numNickels;

  // Constructors: default and with parameters
  public Purse()
  {
    numQuarters = 0;
    numDimes = 0;
    numNickels = 0;
  }

  public Purse(int q, int d, int n)
  {
    numQuarters = q;
    numDimes = d;
    numNickels = n;
  }

  // Acessor methods: get attributes
  public int get_num_quarters()
  {
    return numQuarters;
  }

  public int get_num_dimes()
  {
    return numDimes;
  }

  public int get_num_nickels()
  {
    return numNickels;
  }

  // Modifier methods: change attributes
  public void set_quarters(int q)
  {
    numQuarters = q;
  }

  public void set_dimes(int d)
  {
    numDimes = d;
  }

  public void set_nickels(int n)
  {
    numNickels = n;
  }

  // Increase attributes
  public void add_quarters(int q)
  {
    numQuarters += q;
  }

  public void add_dimes(int d)
  {
    numDimes += d;
  }

  public void add_nickels(int n)
  {
    numNickels += n;
  }

  // Get totals
  public int get_total()
  {
    return numQuarters + numDimes + numNickels;
  }

  public double total_value()
  {
    return numQuarters * 0.25 + numDimes * 0.1 + numNickels * 0.05;
  }

  // Convert a Purse object to a String
  public String to_string()
  {
    return numQuarters + " quarters, " + numDimes + " dimes, " + numNickels + " nickels. Total: $" + total_value();
  }
}
