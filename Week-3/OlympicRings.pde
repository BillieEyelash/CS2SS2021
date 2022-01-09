void setup()
{
  // Window setup
  size(800, 800);
  background(255, 255, 255);
}

void draw()
{
  // Circle settings
  strokeWeight(15);
  noFill();
  // Top row of circle
  stroke(84, 134, 232);
  circle(190, 400, 200);
  stroke(0);
  circle(400, 400, 200);
  stroke(234, 73, 92);
  circle(610, 400, 200);
  // Bottom row
  stroke(255, 183, 0);
  circle(295, 500, 200);
  stroke(56, 175, 39);
  circle(505, 500, 200);
  // Text
  textSize(40);
  fill(255, 0, 0);
  text("Olympic Games", 235, 150);
  text("Tokyo 2020", 270, 200);
}
