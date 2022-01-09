import java.util.*;

public class Library
{
  public static int over_limit(Book[] library, int limit)
  {
    // Find the number of books over the price limit
    int numOverLimit = 0;
    for (int i = 0; i < library.length; i++)
    {
      if (library[i] != null && library[i].get_price() > limit) numOverLimit++;
    }
    return numOverLimit;
  }

  public static String most_expensive(Book[] library)
  {
    // Find the most expensive book and return its title
    int mostExpensiveIndex = 0;
    for (int i = 1; i < library.length; i++)
    {
      if (library[i] != null && library[i].get_price() > library[mostExpensiveIndex].get_price()) mostExpensiveIndex = i;
    }
    return library[mostExpensiveIndex].get_title();
  }

  public static String get_author(Book[] library, String bookTitle)
  {
    // Check if book is in list and return author if so
    for (int i = 0; i < library.length; i++)
    {
      if (library[i] != null && library[i].get_title().equals(bookTitle)) return library[i].get_author();
    }
    return null;
  }

  public static double avg_price(Book[] library)
  {
    double sum = 0;
    int length = 0; // Number of non-null items in library
    for (int i = 0; i < library.length; i++)
    {
      if (library[i] != null)
      {
        sum += library[i].get_price();
        length++;
      }
    }
    return sum / length;
  }

  public static void start_with(Book[] library, char start)
  {
    // Print book titles starting with the char start
    for (int i = 0; i < library.length; i++)
    {
      if (library[i] != null && library[i].get_title().charAt(0) == start) System.out.println(library[i].to_string());
    }
  }

  public static void add_book(Book[] library, String title, String author, double price)
  {
    Book newBook = new Book(title, author, price); // Create new book
    for (int i = 0; i < library.length; i++)
    {
      if (library[i] == null)
      {
        library[i] = newBook;
        return;
      }
    }
    System.out.println("No more space is available."); // Error message if no space is found
  }

  public static void main(String[] args)
  {
    // Create books
    Book atotc = new Book("A Tale of Two Cities", "Charles Dickens", 35);
    Book hp = new Book("Harry Potter", "J. K. Rowling", 30);
    Book tts = new Book("Talking to Strangers", "Malcom Gladwell", 42);
    Book tw = new Book("Three Women", "Lisa Taddeo", 17);
    Book cak = new Book("Catch and Kill", "Ronan Farrow", 25);

    // Build library
    Book[] library = new Book[10];
    library[0] = atotc;
    library[1] = hp;
    library[2] = tts;
    library[3] = tw;
    library[4] = cak;

    // Test methods
    System.out.println(over_limit(library, 30) == 2);
    System.out.println(most_expensive(library).equals("Talking to Strangers"));
    System.out.println(get_author(library, "Harry Potter").equals("J. K. Rowling"));
    System.out.println(avg_price(library)); //around 30
    start_with(library, 'T'); // Talking to Strangers and Three Women
    add_book(library, "Throne of Glass", "Sarah J Maas", 18);
    // Print modified list
    for (int i = 0; i < library.length; i++)
    {
      if (library[i] != null) System.out.println(library[i].to_string());
      else System.out.println("N/A");
    }
  }
}
