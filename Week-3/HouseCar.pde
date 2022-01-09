boolean showBG = false;
boolean showHouse = false;
boolean showRoad = false;
boolean showSun = false;
int sunX = 25;
boolean showCar = false;
int carX = 0;

void setup()
{
  size(800, 800);
}

void draw()
{
  if (showBG) draw_bg();
  if (showHouse) draw_house();
  if (showSun) draw_sun();
  if (showRoad) draw_road();
  if (showCar) draw_car();
}

void keyPressed()
{
  if (key == 'b') showBG = true;
  if (key == 'h') showHouse = true;
  if (key == 's') showSun = true;
  if (key == 'r') showRoad = true;
  if (key == 'c') showCar = true;
}

void draw_bg()
{
  background(68, 165, 240);  // Blue sky
  fill(38, 126, 25);         // Green
  rect(0, 425, 800, 375);    // Grass
}

void draw_house()
{
  fill(185, 4, 10);                       // Red
  rect(400, 200, 300, 300);               // House
  fill(103, 54, 54);                      // Brown
  rect(510, 360, 80, 140);                // Door
  fill(255);                              // White
  rect(450, 275, 50, 50);                 // Left window
  rect(600, 275, 50, 50);                 // Right window
  triangle(400, 200, 700, 200, 550, 100); // Roof
}

void draw_sun()
{
  fill(255, 244, 13);          // Yellow
  circle(sunX, 50, 50);        // Create sun
  sunX++;                      // Sun moves forward
  if (sunX > width) sunX = 0;  // If at edge go back to the beginning
}

void draw_road()
{
  fill(173, 173, 173);    // Grey
  rect(0, 500, 800, 300); // Road
  fill(255);              // White
  // Create dashes
  for (int i = 0; i < 5; i++)
    rect(i * 160, 725, 96, 25);
}

void draw_car()
{
  // Draw car
  fill(103, 54, 54);  // Brown
  beginShape();
  vertex(carX, 650);
  vertex(carX, 600);
  vertex(carX + 50, 600);
  vertex(carX + 100, 550);
  vertex(carX + 200, 550);
  vertex(carX + 250, 600);
  vertex(carX + 300, 600);
  vertex(carX + 300, 650);
  vertex(carX, 650);
  endShape();
  // Draw wheels
  fill(0);          // Black
  circle(carX + 50, 650, 25);
  circle(carX + 250, 650, 25);
  // Move car
  carX += 3;
  if (carX > width) carX = -200;
}
