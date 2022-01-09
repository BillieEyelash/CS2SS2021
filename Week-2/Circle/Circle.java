public class Circle
{
  private int radius;

  public Circle()
  {
    radius = 1;
  }

  public Circle(int r)
  {
    radius = r;
  }

  public int get_radius()
  {
    return radius;
  }

  public void set_radius(int r)
  {
    radius = r;
  }

  public int diameter()
  {
    return radius * 2;
  }

  public double area()
  {
    return Math.pow(radius, 2) * Math.PI;
  }

  public double circumference()
  {
    return diameter() * Math.PI;
  }

  public String to_string()
  {
    String r = "Radius: " + radius;
    String d = "\nDiameter: " + diameter();
    String c = "\nCircumference: " + circumference();
    String a = "\nArea: " + area();
    return r + d + c + a;
  }
}
