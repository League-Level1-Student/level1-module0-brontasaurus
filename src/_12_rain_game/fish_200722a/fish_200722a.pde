
int lorax = 4;
int goalz = 0;
int tortilla = (int) random(800);
int fish = 15;
void setup(){
   size(800, 800);
   background(#5C749B);
  
}


void draw(){
  background(#5C749B);
   fill(0, 0, 0);
    textSize(16);
    text("Score: " + goalz, 20, 20);
  fill(#53BBFA);
    stroke(#3392CB);
    ellipse(tortilla, fish, 15, 20);
    fill(#878B8E);
    stroke(#75797C);
  rect(mouseX, 700, 70, 100);
    fish+=lorax;
  if(fish > 800){
    checkCatch(tortilla);
    fish = 15;
    tortilla = (int) random(800);
  }
  
}


void checkCatch(int x){
         if (x > mouseX && x < mouseX+100){
            goalz++;
            lorax++;
}
         else if (goalz > 0) {
            goalz--;
            lorax--;
         }
        println("Your score is now: " + goalz);
        
        
    }
