public void setup()
{
  int WIDTH = 800;
  int HEIGHT = 600;
  size(800,800);
  background(255);
  gasket((WIDTH-10)/2, 20, WIDTH-40, HEIGHT-20, 40, HEIGHT-20);
  
}

public void gasket(int x1, int y1, int x2, int y2, int x3, int y3)
{
  if( y2 - y1 > 2 && x2 - x3 > 2 ) // base case
  {
    //make a random color for the stroke
    stroke(random(255), random(255), random(255));
    //draw three lines to make a triangle
    triangle(x1, y1, x2, y2, x3, y3);
    
    //make three midpoints
    int mid12x = (x2 + x1) / 2;
    int mid12y = (y2 + y1) / 2;
    int mid23x = x1;
    int mid23y = y2;
    int mid31x = (x1 + x3) / 2;
    int mid31y = mid12y;
    
    //make three recursive calls
    gasket(x1, y1, mid12x, mid12y, mid31x, mid31y);
    gasket(mid12x, mid12y, x2, y2, mid23x, mid23y);
    gasket(mid31x, mid31y, mid23x, mid23y, x3, y3);
  }
}
