void setup()
{
  size(900, 200);
  background(255);
  draw_happy_faces();
}

void draw_happy_faces()
{
  for (int i = 1; i <= 8; i++)
  {
    fill(random(255), random(255), random(255));
    circle(i * 100, 100, 100);         // Face with random color
    fill(0);
    circle(i * 100 - 20, 80, 15);      // Left eye
    circle(i* 100 + 20, 80, 15);       // Right eye
    noFill();
    arc(i * 100, 100, 50, 50, 0, PI);  // Smile
  }
}
