import ddf.minim.*;             //at the very top of your sketch
Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable


int x = 0;
PImage pictureOfRecord;                     //as member variable
void setup(){
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
        size(708,708);                                 //in setup method
        pictureOfRecord= loadImage("record.jpg");
         image(pictureOfRecord, 0, 0);
}

void draw(){
  if (mousePressed){
    song.play();
 rotateImage(pictureOfRecord, x);
        image(pictureOfRecord, 0, 0);  //in draw method
      x+=23;  
  }
  else {
song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
