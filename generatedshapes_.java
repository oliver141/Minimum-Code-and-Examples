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

public class generatedshapes_ extends PApplet {

public void setup() {
  
}
 
public void draw() {
  float x = random(500);
  float y = random(500);
  float w = random(100);
  float h = random(100);
  fill(random(255), random(255), random(255));
  rect(x, y, w, h);
  ellipse(x, y, w, h);
  triangle(random(500),random(500),random(500),random(500),random(500),random(500)); 
} 
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "generatedshapes_" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
