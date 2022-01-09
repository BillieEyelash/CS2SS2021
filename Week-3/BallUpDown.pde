int ballx = 90;
int bally = 90;
int xspeed = 3;
int yspeed = 5;

void setup()
{
  size(800, 800);
}

void draw()
{
  draw_bg();
  fill(255, 0, 0);
  circle(ballx, bally, 75);
  ballx += xspeed;
  bally += yspeed;
  if (bally < 90 || bally > 600) yspeed *= -1;
  if (ballx < 90 || ballx > 700) xspeed *= -1;
}

void draw_bg()
{
  background(0);
  fill(0, 255, 0);
  for (int i = 1; i <= 9; i++)
  {
    if (i <= 5) rect(i * 75 - 25, i * 125, 75, 10);
    else rect(i * 75 - 25, (10 - i) * 125, 75, 10);
  }
}
