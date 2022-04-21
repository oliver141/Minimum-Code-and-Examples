void setup() {
  size(500, 500);
}
 
void draw() {
  float x = random(500);
  float y = random(500);
  float w = random(100);
  float h = random(100);
  fill(random(255), random(255), random(255));
  rect(x, y, w, h);
  ellipse(x, y, w, h);
  triangle(random(500),random(500),random(500),random(500),random(500),random(500)); 
} 
