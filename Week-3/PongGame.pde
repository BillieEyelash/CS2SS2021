// Constants
int MAX_SCORE = 10;
int PADDLE_WIDTH = 20;
int PADDLE_HEIGHT = 200;
int GAP = 10;    // Gap between paddle and edge
int BALL_RADIUS = 50;
int PLAYER_SPEED = 15;
boolean intro = true;
boolean play = false;
boolean gameOver = false;
boolean computerPlayer = false;
int difficulty = 1;
int scoreP1 = 0;
int scoreP2 = 0;
// Y-coordinates of players -- x does not change
int yPlayer1;
int yPlayer2;
// Coordinates and speed of ball
int ballX;
int ballY;
int xSpeed = 0;
int ySpeed = 0;
int direction = 1;

void setup()
{
  // Set window size and use to set paddle and ball coordinates
  size(1600, 1000);
  yPlayer1 = height / 2 - PADDLE_HEIGHT / 2;
  yPlayer2 = height / 2 - PADDLE_HEIGHT / 2;;
  reset_ball();
  textFont(createFont("OCR A Extended", 10));
}

void draw()
{
  screen();
  if (intro) intro_text();
  else if (gameOver) end_screen();
  else if (play) play_game();
}

void keyPressed()
{
  // Enter key launches ball
  if (key == ENTER && !play)
  {
    intro = false;
    play = true;
    random_xspeed();
    if (random(2) < 1) direction *= -1; // Random direction
    random_yspeed();
  }

  // Control player 1 with a and z keys
  if (key == 'a' && yPlayer1 > 0 && !computerPlayer) yPlayer1 -= PLAYER_SPEED;
  if (key == 'z' && yPlayer1 < height - PADDLE_HEIGHT && !computerPlayer) yPlayer1 += PLAYER_SPEED;
  // Control player 2 with up and down keys
  if (keyCode == UP && yPlayer2 > 0) yPlayer2 -= PLAYER_SPEED;
  if (keyCode == DOWN && yPlayer2 < height - PADDLE_HEIGHT) yPlayer2 += PLAYER_SPEED;

  // Change difficulty
  if (key == 'e' && difficulty > 1) difficulty--;
  if (key == 'h') difficulty++;

  // Player 1 becomes computer player
  if (key == 'c' && !play) computerPlayer = true;
}

void screen()
{
  background(0);

  // Display scores
  fill(0, 255, 0);
  textSize(100);
  text(scoreP1, width / 4, 100);
  text(scoreP2, width / 4 * 3, 100);

  // Dashes down the middle
  fill(255);
  for (int i = 0; i < 10; i++)
    rect(width / 2 - 15, i * 100 + 10, 30, 70);

  // Middle ring
  strokeWeight(10);
  stroke(255);
  noFill();
  circle(width / 2, height / 2, BALL_RADIUS * 4);
  noStroke();

  // Ball
  fill(255, 0, 0);
  circle(ballX, ballY, BALL_RADIUS * 2);

  // Paddles
  fill(0, 255, 0);
  rect(GAP, yPlayer1, PADDLE_WIDTH, PADDLE_HEIGHT);
  rect(width - (GAP + PADDLE_WIDTH), yPlayer2, PADDLE_WIDTH, PADDLE_HEIGHT);
}

void intro_text()
{
  fill(255);
  textSize(40);
  // Give user(s) instructions
  text("    Player 1: use the a\n       and z keys to\n    control your paddle\n\n" +
       "    Player 2: use the up\n     and down keys to\n    control your paddle\n\n" +
       "   Press 'e' to make the\n    game easier and 'h'\n     to make it harder\n\n" +
       "  Press 'c' to make Player\n    1 a computer player", 50, 200);
  textSize(100);
  text("Press ENTER\n  to play", width / 2 + 75, 250);
}

void play_game()
{
  // Ball continues to move
  ballX += (direction * xSpeed);
  ballY += ySpeed;
  
  // Computer makes a move if is playing
  if (computerPlayer) computer_move();
  
  // If you wanted to have Player 1 paddle follows mouse you could use the following line
  // if (mouseY > 0 && mouseY < height - PADDLE_HEIGHT) yPlayer1 = mouseY;

  // If the ball touches a paddle bounce off in random direction
  if (ballY > yPlayer1 && ballY < yPlayer1 + PADDLE_HEIGHT && ballX <= BALL_RADIUS + PADDLE_WIDTH + GAP)
  {
    random_xspeed();
    direction = 1;
    random_yspeed();
  }
  else if (ballY > yPlayer2 && ballY < yPlayer2 + PADDLE_HEIGHT && ballX >= width - (BALL_RADIUS + PADDLE_WIDTH + GAP))
  {
    random_xspeed();
    direction = -1;
    random_yspeed();
  }

  // Bounce off upper and lower edges
  if (ballY <= BALL_RADIUS || ballY >= height - BALL_RADIUS) ySpeed *= -1;

  // Scoring points -- increase score and reset ball
  if (ballX <= BALL_RADIUS)
  {
    scoreP2++;
    reset_ball();
  }
  else if (ballX >= width - BALL_RADIUS)
  {
    scoreP1++;
    reset_ball();
  }

  // Check for winner
  if (scoreP1 >= MAX_SCORE || scoreP2 >= MAX_SCORE)
  {
    play = false;
    gameOver = true;
  }
}

void computer_move()
{
  if (xSpeed * direction < 0)
  {
    // Locate the point along the paddle's path where the ball will hit
    int ballToPaddle = ((ballX - BALL_RADIUS) - (PADDLE_WIDTH + GAP)) / (xSpeed);
    int changeHeight = (ballToPaddle * ySpeed) % height;
    int goTo = ballY + changeHeight;
    // Go to point
    if (yPlayer1 < goTo - PADDLE_HEIGHT / 2 && yPlayer1 < height - PADDLE_HEIGHT) yPlayer1 += (PLAYER_SPEED - 5);
    if (yPlayer1 > goTo - PADDLE_HEIGHT / 2 && yPlayer1 > 0) yPlayer1 -= (PLAYER_SPEED - 5);
  }
}

void end_screen()
{
  // Display "GAME OVER"
  fill(255);
  textSize(250);
  text("GAME OVER", 125, height / 2 - 100);
  // Display winner
  textSize(150);
  if (scoreP1 > scoreP2) text("Player 1 wins!", 200, height / 2 + 200);
  else text("Player 2 wins!", 200, height / 2 + 200);
}

void reset_ball()
{
  // Reset ball to middle and pause game
  ballX = width / 2;
  ballY = height / 2;
  play = false;
}

void random_xspeed()
{
  // Pick a random x speed
  xSpeed = difficulty + (int)random(5);
}

void random_yspeed()
{
  // Pick a random y speed
  ySpeed = difficulty + (int)random(3);
  if (random(2) < 1) ySpeed *= -1;
}
