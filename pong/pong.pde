int x=250;
int y=52;
int xspeed=5;
int yspeed=5;
void setup(){
size(500, 500);
background(255,0,0);

}

void draw(){
 background(255,0,0);
  x+=xspeed;
  y+=yspeed;
  fill(0, 0, 0);
stroke(0, 0, 0);
ellipse(x, y, 20, 20);
if(x>=500||x<=0){
xspeed=-xspeed;

}
if(y>=500||y<=0){
yspeed=-yspeed;

}
}