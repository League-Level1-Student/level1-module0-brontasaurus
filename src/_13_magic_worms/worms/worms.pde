
float x = random(500);
float y = random(500);
void setup(){
  size(500, 500);
    background(#7AA549);
  
}

void draw(){
  //background(#7AA549);
  makeMagical();
  for (int i=0 ; i<300 ; i++){
    //fill(#497BA5);
    stroke(#497BA5);
    ellipse(x, y, 10, 10);
    x = getWormX(i);
    y = getWormY(i);
    
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
