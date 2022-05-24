Ball[] balls;

void setup() {
  size(600,600);
  balls = new Ball[30];
  for (int i =0; i < balls.length; i++) {
    balls[i] = new Ball();
  }
}

void draw() { background(0);
  for (int i =0; i< balls.length; i++){
    balls[i].draw();
    balls[i].process();
    for (int j = i; j<balls.length; j++){
      if(Math.pow(balls[i].getX()-balls[j].getX(),2)+Math.pow(balls[i].getY()-balls[j].getY(),2) <= 350) {
        balls[i].bounceBall();
        balls[j].bounceBall();
      }
    }
  }
}

void mouseClicked() {background(100);}


class Ball
{
  final static int DEAD = 1;
  final static int MOVING = 0;
  float x; float y; float rad; color c; int state;
  float dx; float dy;
  Ball() {
    float r = random(256);
    float g = random(256);
    float b = random(256);
    c = color(r,g,b);
    rad = 10;
    x = random((width - r) + r/2);
    y = random((width - r) + r/2);
    dx = random(10) - 5;
    dy = random(10) - 5;
    state = MOVING;
  }
  
  void bounceBall() {
    dx = -1*dx;
    dy = -1*dy;
  }
  float getX() {return x;}
  float getY() {return y;}
  void move() {x = x+dx; y = y+dy; bounce();}
  void bounce () {
    if (x < rad) {
      dx = abs(dx);
    }
    if (x> width-rad) {dx = -1*abs(dx);}
    if (y < rad) {
      dy = abs(dy);
    }
    if (y> height-rad) {dy = -1*abs(dy);}
    
  }
  void draw () {
    if (state != DEAD) {
      ellipseMode(RADIUS);
      fill(c);
      stroke(c);
      ellipse(x,y,rad,rad);
    }
  }
  void process() {if(state == MOVING) move();}
}
