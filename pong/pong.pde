PImage backgroundImage;

import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x=250;
int y=52;
int xspeed=5;
int yspeed=5;
void setup(){
  size(500, 500);
  
  backgroundImage = loadImage("image.jpg");
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);




}

void draw(){
  image(backgroundImage, 0, 0);

image(backgroundImage, 0, 0, 500, 500);
  
  rect(450, mouseY, 15, 45);

 
  x+=xspeed;
  y+=yspeed;
  fill(0, 0, 0);
stroke(0, 0, 0);
ellipse(x, y, 20, 20);
if(x>=500){
println("YOU LOSE!!!!");
}
if(x<=0){
xspeed=-xspeed;
sound.trigger();
}
if(y>=500||y<=0){
yspeed=-yspeed;
sound.trigger();
}
if(intersects(x, y, 450, mouseY,45)==true){
xspeed=-xspeed;
sound.trigger();

}
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}