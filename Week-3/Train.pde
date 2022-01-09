void setup()
{
  size(800, 400);
  background(255);
  make_train();
}

void draw()
{
  stroke(0);
  fill(255, 255, 0);
  circle(200, 100, 75);
}

void make_train()
{
  noStroke();
  // Train cars and wheels
  for (int i = 0; i < 6; i++)
  {
    fill(random(255), random(255), random(255)); // Random color
    rect(125 + i * 100, 300, 90, 60);            // Train car
    if (i == 5)
    {
      rect(140 + i * 100, 295, 60, 5); // For final car
      stroke(0);
      strokeWeight(2);
      line(135 + i * 100, 295, 205 + i * 100, 295);
    }
    noStroke();
    // Wheels
    fill(0);
    circle(145 + i * 100, 360, 30);
    circle(195 + i * 100, 360, 30);
  }
  // Front
  triangle(125, 330, 125, 360, 95, 360);
  // Chimney
  beginShape();
  vertex(135, 300);
  vertex(135, 280);
  vertex(125, 270);
  vertex(125, 260);
  vertex(155, 260);
  vertex(155, 270);
  vertex(145, 280);
  vertex(145, 300);
  endShape();
  // Windows
  fill(255);
  rect(640, 320, 20, 20);
  rect(680, 320, 20, 20);
}
