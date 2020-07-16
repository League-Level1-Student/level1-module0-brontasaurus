import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_200715a extends PApplet {

             //at the very top of your sketch
Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable


int x = 0;
PImage pictureOfRecord;                     //as member variable
public void setup(){
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
                                         //in setup method
        pictureOfRecord= loadImage("record.jpg");
         image(pictureOfRecord, 0, 0);
}

public void draw(){
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

public void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
  public void settings() {  size(708,708); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--hide-stop", "sketch_200715a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
