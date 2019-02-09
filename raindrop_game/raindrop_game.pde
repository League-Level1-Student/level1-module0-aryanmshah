int x= 50;
int y=10;
int score=0;
void setup(){
size(500, 500);

 
}

void draw(){
  background(255,0,0);
  if(y>=500){
  y=0;
   x = (int) random(500);
  }
  y+=5;
  fill(173,216,230);
stroke(0, 0, 255);
ellipse(x, y, 20, 37);

rect(mouseX, 450 , 60, 50);

if(x>=mouseX&&x<mouseX+50&&y>=450){
y=0;
x = (int) random(500);
  score++;

}

fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);


}