float x = 170;
float y = 160;
float w = 150;
float h = 80;
void setup(){
 size(500,500);
 background(255);
 stroke(0);
 noFill();
}
void draw(){
 background(255);
 rect(x,y,w,h);
 fill(20, 75, 200);
 if(mousePressed){
  if(mouseX>x && mouseX <x+w && mouseY>y && mouseY <y+h){
   println("Quit");
   exit();
  }
 } 
}
