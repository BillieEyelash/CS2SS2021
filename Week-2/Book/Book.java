public class Book
{
  private String title;
  private String author;
  private double price;

  public Book(String t, String a, double p)
  {
    title = t;
    author = a;
    price = p;
  }

  public String get_title()
  {
    return title;
  }

  public String get_author()
  {
    return author;
  }

  public double get_price()
  {
    return price;
  }

  public void set_price(int p)
  {
    price = p;
  }

  public String to_string()
  {
    return title + ", " + author + ", $" + price;
  }
}
