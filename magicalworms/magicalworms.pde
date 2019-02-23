float X; float Y;
void setup(){
size(500, 500);
background(0, 40, 230);



}


void draw(){
X=random(600);
Y=random(600);
makeMagical();
for(int i=0; i<301;i++){
  fill(random(255),random(255),random(255));
ellipse(getWormX(i),getWormY(i),50,50);
}

}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}