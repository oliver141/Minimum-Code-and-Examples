import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class imageandtextexample extends PApplet {

float imageX, imageY, imageWidth, imageHeigth, imageWidthRatio=0.0f, imageHeightRatio=0.0f;
float largerDimension, smallerDimension;
PImage pic;
Boolean widthLarger=false, heightLarger=false;
public void setup(){
 
pic = loadImage("toocutedog.jpg"); 
int picWidth = 800; 
int picHeight = 600; 
if ( picWidth >= picHeight ) {
  largerDimension = picWidth;
  smallerDimension = picHeight;
  widthLarger = true;
} else {
  largerDimension = picHeight;
  smallerDimension = picWidth;
  heightLarger = true;
}
println(smallerDimension, largerDimension, widthLarger, heightLarger); 
if ( widthLarger == true ) imageWidthRatio = largerDimension / largerDimension;
if ( widthLarger == true ) imageHeightRatio = smallerDimension / largerDimension;
if ( heightLarger == true ) imageHeightRatio = largerDimension / largerDimension;
if ( heightLarger == true ) imageWidthRatio = smallerDimension / largerDimension;
println(imageWidthRatio, imageHeightRatio, smallerDimension/largerDimension, 600.0f/800.0f); //Verify variable values
imageX = width*0;
imageY = height*0;
imageWidth = width*imageWidthRatio;
imageHeigth = height*imageHeightRatio;
if ( imageWidth > width ) println("ERROR: Image is too wide"); 
if ( imageHeigth > height ) println("ERROR: Image is too high"); 
rect(imageX, imageY, imageWidth, imageHeigth);
image(pic, imageX, imageY, imageWidth, imageHeigth);
textSize(24);
text("Damn, This dog is very cute.", width-400, 50);
}
  public void settings() { 
size(1000, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "imageandtextexample" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
